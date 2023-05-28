package linecomment.music.entities.vo.param;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * @author linecomment
 * @date 2023/5/28 14:37:33
 */
@Data
@ToString
@JsonSerialize
public class RegisterParam implements Serializable {
    @Email(message = "邮箱格式错误")
    private String email;
    @NotBlank(message = "验证码不能为空")
    @Length( message = "验证码错误",min=6,max=6)
    private String verifyCode;
    @NotBlank(message = "密码不能为空")
    @Length(message = "密码长度必须在{min}-{max}之间", min = 6,max = 15)
    private String password;
}
