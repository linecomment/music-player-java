package linecomment.music.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import linecomment.music.entities.dao.SysUser;
import linecomment.music.entities.vo.param.LoginParam;
import linecomment.music.entities.vo.param.RegisterParam;
import linecomment.music.mapper.SysUserMapper;
import linecomment.music.service.UserService;
import linecomment.music.utils.EncryptUtil;
import linecomment.music.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.regex.Pattern;

/**
 * @author linecomment
 * @date 2023/5/28 14:36:13
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public String login(LoginParam loginParam) {

        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String register(RegisterParam registerParam) {
        log.info("registerParam: {}",registerParam);
        Snowflake snowflake = IdUtil.getSnowflake();
        long id = snowflake.nextId();
        String token = JwtUtil.generateToken(id, 60 * 60 * 2);
        String account;
        if (regxVerify(registerParam.getAccount())) {
            // 手机号
            account = registerParam.getAccount();
        }else {
            // 邮箱
            account = registerParam.getAccount();
        }
        SysUser sysUser = new SysUser();
        sysUser.setUserId(id);
        sysUser.setNickname("");
        sysUser.setPassword(EncryptUtil.encryptPasswd(registerParam.getPassword()));
        sysUser.setGender(1);
        sysUser.setBirthday(DateUtil.format(new Date(),"yyyy-MM-dd"));
        sysUser.setAvatarUrl("D:\\music-palyer-java\\music\\avatar\\default.png");
        // todo 插入数据
        return token;
    }

    private boolean regxVerify(String expr){
        return Pattern.matches("^1[3-9]\\d{9}$", expr);
    }

}
