package linecomment.music.entities.vo;

/**
 * @author linecomment
 * @date 2023/5/28 10:09:21
 */
public class ResultVO<T> {
    private int code;

    private String message;
    private T data;


    public ResultVO(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(20000, "成功", data);
    }

    public static <T> ResultVO<T> error(int code, String message) {
        return new ResultVO<>(code, message, null);
    }
 }
