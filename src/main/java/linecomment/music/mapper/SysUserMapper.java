package linecomment.music.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author linecomment
 * @date 2023/5/28 22:20:25
 */
@Mapper
public interface SysUserMapper {
    /**
     * 新增新用户
     * @return
     */
    int addUser();
}
