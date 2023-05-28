package linecomment.music.utils;

import cn.hutool.captcha.generator.RandomGenerator;
import cn.hutool.core.util.RandomUtil;

/**
 * 邮箱验证码类，提供
 * @author linecomment
 * @date 2023/5/28 09:44:01
 */
public class VerifyCodeUtil {

    /**
     * 生成随机六位验证码
     * @return String
     */
    public static String getVerifyCode(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 6; i++){
            stringBuilder.append(RandomUtil.randomInt(10));
        }
        return stringBuilder.toString();
    }
}
