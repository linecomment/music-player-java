package linecomment.music.service;

import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpSession;

/**
 * @author linecomment
 * @date 2023/5/28 08:18:21
 */
public interface EmailService {
    /**
     * 发送邮箱验证码
     */
    String sendEmailCode(String toEmail, HttpSession session);
}
