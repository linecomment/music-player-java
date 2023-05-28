package linecomment.music.controller;

import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpSession;
import linecomment.music.entities.vo.ResultVO;
import linecomment.music.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 与发送邮件相关
 * @author linecomment
 * @date 2023/5/28 08:18:48
 */
@RestController
@RequestMapping("/mail")
public class EmailController {

    @Autowired
    private EmailService emailService;
    @PostMapping("/sendEmail")
    public ResultVO<String> sendEmail(String email, HttpSession session){
        return ResultVO.success(emailService.sendEmailCode(email,session));
    }
}
