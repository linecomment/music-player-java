package linecomment.music.service.impl;

import linecomment.music.entities.vo.param.RegisterParam;
import linecomment.music.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author linecomment
 * @date 2023/5/28 14:36:13
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public String register(RegisterParam registerParam) {
        log.info("registerParam: {}",registerParam);
        return "";
    }
}
