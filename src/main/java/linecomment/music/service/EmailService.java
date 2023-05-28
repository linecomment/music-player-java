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
     * @param toEmail 收信邮箱
     * @param session session
     * @return String code
     */
    String sendEmailCode(String toEmail, HttpSession session);
}
