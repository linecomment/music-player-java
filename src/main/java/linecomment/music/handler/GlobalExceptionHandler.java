package linecomment.music.handler;

import linecomment.music.entities.vo.ResultVO;
import linecomment.music.exception.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 * @author linecomment
 * @date 2023/5/28 11:14:16
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResultVO<Object> handleBusinessException(BusinessException e) {
        return ResultVO.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResultVO<Object> handlerException(){
        return ResultVO.error(50000,"出错了");
    }
}
