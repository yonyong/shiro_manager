package cn.yonyong.shiro.manager.service.impl;

import cn.yonyong.shiro.manager.mapper.UserRoleMapper;
import cn.yonyong.shiro.manager.pojo.User;
import cn.yonyong.shiro.manager.pojo.UserRole;
import cn.yonyong.shiro.manager.pojo.UserRoleExample;
import cn.yonyong.shiro.manager.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService{
 
    @Autowired UserRoleMapper userRoleMapper;
    @Override
    public void setRoles(User user, long[] roleIds) {
        //删除当前用户所有的角色
        UserRoleExample example= new UserRoleExample();
        example.createCriteria().andUidEqualTo(user.getId());
        List<UserRole> urs= userRoleMapper.selectByExample(example);
        for (UserRole userRole : urs)
            userRoleMapper.deleteByPrimaryKey(userRole.getId());
 
        //设置新的角色关系
        if(null!=roleIds)
            for (long rid : roleIds) {
                UserRole userRole = new UserRole();
                userRole.setRid(rid);
                userRole.setUid(user.getId());
                userRoleMapper.insert(userRole);
            }
    }
    @Override
    public void deleteByUser(long userId) {
        UserRoleExample example= new UserRoleExample();
        example.createCriteria().andUidEqualTo(userId);
        List<UserRole> urs= userRoleMapper.selectByExample(example);
        for (UserRole userRole : urs) {
            userRoleMapper.deleteByPrimaryKey(userRole.getId());
        }
    }
    @Override  
    public void deleteByRole(long roleId) {
        UserRoleExample example= new UserRoleExample();
        example.createCriteria().andRidEqualTo(roleId);
        List<UserRole> urs= userRoleMapper.selectByExample(example);
        for (UserRole userRole : urs) {
            userRoleMapper.deleteByPrimaryKey(userRole.getId());
        }
    }
 
}