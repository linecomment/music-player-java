package linecomment.music.handler;

import linecomment.music.entities.vo.ResultVO;
import linecomment.music.exception.BusinessException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * 全局异常处理
 * @author linecomment
 * @date 2023/5/28 11:14:16
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 自定义业务异常
     */
    @ExceptionHandler(BusinessException.class)
    public ResultVO<Object> handleBusinessException(BusinessException e) {
        return ResultVO.error(e.getCode(),e.getMessage());
    }

    /**
     * 参数校验异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        List<ObjectError> allErrors = e.getBindingResult().getAllErrors();
        StringBuilder errorMsg = new StringBuilder();
        for (ObjectError error : allErrors) {
            errorMsg.append(error.getDefaultMessage()).append("; ");
        }

        return ResultVO.error(60000,errorMsg.toString());
    }

    @ExceptionHandler(Exception.class)
    public ResultVO<Object> handlerException(Exception e){
        return ResultVO.error(50000,e.getMessage());
    }


}
