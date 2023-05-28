package linecomment.music.entities.vo.param;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

/**
 * @author linecomment
 * @date 2023/5/28 21:40:32
 */
@Data
@AllArgsConstructor
public class LoginParam implements Serializable {
    @NotBlank(message = "账号不能为空")
    private String account;
    @NotBlank(message = "密码不能为空")
    private String password;
}
