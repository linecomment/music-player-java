package linecomment.music.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 全局业务异常处理
 * @author linecomment
 * @date 2023/5/28 11:00:34
 */

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class BusinessException extends RuntimeException{
    private int code;

    private String message;
}
