package linecomment.music.entities.vo.param;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

/**
 * @author linecomment
 * @date 2023/5/28 14:37:33
 */
@Data
@AllArgsConstructor
public class RegisterParam implements Serializable {
    @NotBlank(message = "账号不能为空")
    @Pattern(regexp = "^1[3-9]\\d{9}$|^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+",message = "账号格式错误")
    private String account;
    @NotBlank(message = "验证码不能为空")
    @Length( message = "验证码错误",min=6,max=6)
    private String verifyCode;
    @NotBlank(message = "密码不能为空")
    @Length(message = "密码长度必须在{min}-{max}之间", min = 6,max = 15)
    private String password;
}
