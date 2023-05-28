package linecomment.music.util;

import linecomment.music.utils.VerifyCodeUtil;
import org.junit.jupiter.api.Test;

/**
 * @author linecomment
 * @date 2023/5/28 10:00:24
 */
public class VerifyCodeTest {
    @Test
    public void getVerifyCodeTest(){
        System.out.println(VerifyCodeUtil.getVerifyCode());
    }
}
