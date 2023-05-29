package linecomment.music.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import linecomment.music.common.StatusEnum;
import linecomment.music.common.UserStatusEnum;
import linecomment.music.entities.dao.SysUser;
import linecomment.music.entities.vo.param.LoginParam;
import linecomment.music.entities.vo.param.RegisterParam;
import linecomment.music.exception.BusinessException;
import linecomment.music.mapper.SysUserMapper;
import linecomment.music.service.UserService;
import linecomment.music.utils.EncryptUtil;
import linecomment.music.utils.JwtUtil;
import linecomment.music.utils.RedisUtil;
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
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String login(LoginParam loginParam) {

        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String register(RegisterParam registerParam) {
        log.info("registerParam: {}",registerParam);

        // 校验验证码正确性
        if (!redisUtil.get(registerParam.getAccount()).equals(registerParam.getVerifyCode())) {
            throw new BusinessException(StatusEnum.VerifyCodeError.getCode(), StatusEnum.VerifyCodeError.getValue());
        }
        System.out.println(redisUtil.get(registerParam.getAccount()));
        Snowflake snowflake = IdUtil.getSnowflake();
        long id = snowflake.nextId();
        String token = JwtUtil.generateToken(id, 60 * 60 * 2);

        SysUser sysUser = new SysUser();
        if (regxVerify(registerParam.getAccount())) {
            // 手机号
            sysUser.setPhone(registerParam.getAccount());
        }else {
            // 邮箱
            sysUser.setEmail(registerParam.getAccount());
        }

        sysUser.setUserId(id);
        sysUser.setNickname("");
        sysUser.setPassword(EncryptUtil.encryptPasswd(registerParam.getPassword()));
        sysUser.setGender(1);
        sysUser.setBirthday(DateUtil.format(new Date(),"yyyy-MM-dd"));
        sysUser.setAvatarUrl("D:\\music-palyer-java\\music\\avatar\\default.png");
        sysUser.setCode("");
        sysUser.setStatus(UserStatusEnum.NORMAL.getCode());
        sysUser.setCreateTime(DateUtil.format(new Date(),"yyyy-MM-dd"));
        sysUser.setLoginTime("DateUtil.format(new Date(),\"yyyy-MM-dd\")");
        sysUserMapper.addUser(sysUser);
        return token;
    }

    private boolean regxVerify(String expr){
        return Pattern.matches("^1[3-9]\\d{9}$", expr);
    }

}
