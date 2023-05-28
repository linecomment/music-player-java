package linecomment.music.utils;

import cn.hutool.crypto.digest.DigestUtil;

/**
 * 加密工具类
 * @author linecomment
 * @date 2023/5/28 10:34:29
 */
public class EncryptUtil {
    /**
     * 密码加密
     */
    public static String encryptPasswd(String password){
        return DigestUtil.sha256Hex(password);
    }
}
