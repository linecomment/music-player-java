package linecomment.music.entities.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author linecomment
 * @date 2023/5/28 15:31:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUser {
    private Long userId;
    private String nickname;
    private String password;
    private Integer gender;
    private String email;
    private String phone;
    private String birthday;
    private String avatarUrl;
    private String code;
    private Integer status;
    private String createTime;
    private String loginTime;
    private String description;
    private String loginIp;
}
