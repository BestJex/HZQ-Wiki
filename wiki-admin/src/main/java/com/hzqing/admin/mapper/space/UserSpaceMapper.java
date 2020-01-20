package com.hzqing.admin.mapper.space;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hzqing.admin.domain.space.UserSpace;
import com.hzqing.admin.dto.space.UserSpaceDto;
import com.hzqing.admin.model.entity.system.User;

import java.util.List;

/**
 * @author hzqing
 * @date 2019-05-21 14:47
 */
public interface UserSpaceMapper extends BaseMapper<UserSpace> {

    List<UserSpaceDto> selectList(UserSpace userSpace);

    List<User> selectUserListBySID(int spaceId);

    int insert(UserSpace userSpace);

    int update(UserSpace userSpace);

    int deletedById(String id);
}
