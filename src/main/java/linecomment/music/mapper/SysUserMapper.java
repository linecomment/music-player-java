package linecomment.music.mapper;

import linecomment.music.entities.dao.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linecomment
 * @date 2023/5/28 22:20:25
 */
@Mapper
public interface SysUserMapper {
    /**
     * 新增新用户
     * @param sysUser 用户对象
     * @return 1
     */
    int addUser(SysUser sysUser);
}
