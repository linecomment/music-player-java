package linecomment.music.entities.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author linecomment
 * @date 2023/5/28 10:05:31
 */
@Data
public class MailDTO implements Serializable {
    private String email;
    private String emailCode;

}
