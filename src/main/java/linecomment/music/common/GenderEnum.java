package linecomment.music.common;

/**
 * @author linecomment
 * @date 2023/5/28 22:23:34
 */
public enum GenderEnum {
    /** 性别 */

    MALE(1,"男"),
    FEMALE(0,"女");

    private int code;
    private String gender;
    GenderEnum(int code,String gender){
        this.code = code;
        this.gender = gender;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
