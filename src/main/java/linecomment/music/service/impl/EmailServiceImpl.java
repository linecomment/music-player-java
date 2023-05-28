package linecomment.music.service.impl;

import jakarta.servlet.http.HttpSession;
import linecomment.music.exception.BusinessException;
import linecomment.music.service.EmailService;
import linecomment.music.utils.VerifyCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author linecomment
 * @date 2023/5/28 08:33:41
 */
@Service
public class EmailServiceImpl implements EmailService {

    @Value("${spring.mail.username}")
    private String fromEmail;

    /** 邮箱正则 */
    private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");

    @Autowired
    private JavaMailSender mailSender;


    /**
     * 发送邮箱验证码
     */
    @Override
    public String sendEmailCode(String toEmail, HttpSession session){
        Matcher matcher = PATTERN.matcher(toEmail);
        if(!matcher.matches()){
            // todo 抛出邮箱格式错误
            throw new BusinessException(200,"邮箱格式错误");
        }
        return sendEmailCode(fromEmail,toEmail);
    }

    private String sendEmailCode(String fromEmail,String toEmail){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setSubject("您本次的验证码是");
        String verCode = VerifyCodeUtil.getVerifyCode();
        message.setText("尊敬的用户,您好:\n"
                + "\n本次请求的邮件验证码为:" + verCode + ",本验证码 5 分钟内效，请及时输入。（请勿泄露此验证码）\n"
                + "\n如非本人操作，请忽略该邮件。\n(这是一封通过自动发送的邮件，请不要直接回复）");
        mailSender.send(message);
        return verCode;
    }


}
