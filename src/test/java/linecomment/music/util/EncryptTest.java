package linecomment.music.util;

import linecomment.music.utils.EncryptUtil;
import org.junit.jupiter.api.Test;

/**
 * @author linecomment
 * @date 2023/5/28 10:42:05
 */
public class EncryptTest {
    @Test
    void encryptPasswd(){
        System.out.println(EncryptUtil.encryptPasswd("1234"));
    }
}
