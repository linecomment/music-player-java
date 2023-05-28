package linecomment.music.service;

import linecomment.music.entities.vo.param.RegisterParam;

/**
 * @author linecomment
 * @date 2023/5/28 08:14:27
 */
public interface UserService {
    /**
     * 注册
     * @param registerParam 表单参数
     * @return String
     */
    String register(RegisterParam registerParam);
}
