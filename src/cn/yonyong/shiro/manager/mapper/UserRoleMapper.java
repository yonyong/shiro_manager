package cn.yonyong.shiro.manager.mapper;

import cn.yonyong.shiro.manager.pojo.UserRole;
import cn.yonyong.shiro.manager.pojo.UserRoleExample;

import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}