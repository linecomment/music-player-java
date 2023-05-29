package linecomment.music.common;

/**
 * 用户状态枚举
 * @author linecomment
 * @date 2023/5/28 22:53:16
 */
public enum UserStatusEnum {
    BLOCK(0,"封禁"),
    NORMAL(1,"正常");

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

    private int code;
    private String value;

    UserStatusEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }
}
