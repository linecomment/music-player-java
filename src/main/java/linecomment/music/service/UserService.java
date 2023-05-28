package linecomment.music.service;

import linecomment.music.entities.vo.param.LoginParam;
import linecomment.music.entities.vo.param.RegisterParam;

/**
 * @author linecomment
 * @date 2023/5/28 08:14:27
 */
public interface UserService {
    /**
     * 登入
     * @param loginParam 登入参数
     * @return String token
     */
    String login(LoginParam loginParam);

    /**
     * 注册
     * @param registerParam 表单参数
     * @return String token
     */
    String register(RegisterParam registerParam);
}
