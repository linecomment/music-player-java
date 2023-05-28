package linecomment.music.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author linecomment
 * @date 2023/5/28 14:07:39
 */
public class JwtUtil {

    private static final String SECRET = "linecomment";

    public static  String generateToken(long userId,long expireTime){
        Map<String,Object> claims = new HashMap<>(10);
        claims.put("userId",userId);
        JwtBuilder jwtBuilder = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,SECRET)
                .setClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expireTime));
        return jwtBuilder.compact();
    }

    public static Map<String,Object> parseToken(String token){
        try {
            Claims claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
            return new HashMap<>(claims);
        } catch (ExpiredJwtException e) {
            // token已过期
            throw new RuntimeException("Token已过期");
        } catch (UnsupportedJwtException e) {
            // 不支持的token类型
            throw new RuntimeException("不支持的Token类型");
        } catch (MalformedJwtException e) {
            // token格式错误
            throw new RuntimeException("Token格式错误");
        } catch (SignatureException e) {
            // 签名校验失败
            throw new RuntimeException("签名校验失败");
        } catch (Exception e){
            // 其他异常
            throw new RuntimeException("Token解析异常");
        }
    }

}
