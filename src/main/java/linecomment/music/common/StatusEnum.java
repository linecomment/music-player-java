package linecomment.music.common;

/**
 * 状态码
 * @author linecomment
 * @date 2023/5/28 10:17:14
 */
public enum StatusEnum {
    /** 2 开头 成功， 4 开头 失败 */
    LOGIN_SUCCESS(20001,"登入成功"),
    REGISTER_SUCCESS(20002,""),
    ILLEGAL_PARAM(40001,"非法参数"),
    NO_LOGIN(40002,"未登入"),
    VerifyCodeError(40003,"邮箱验证码错误");

    private int code;
    private String value;

    StatusEnum(int i, String s) {
        this.code = i;
        this.value = s;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
