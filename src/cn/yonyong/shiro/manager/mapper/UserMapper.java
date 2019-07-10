package cn.yonyong.shiro.manager.mapper;

import cn.yonyong.shiro.manager.pojo.User;
import cn.yonyong.shiro.manager.pojo.UserExample;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}