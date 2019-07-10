package cn.yonyong.shiro.manager.service;
 
import cn.yonyong.shiro.manager.pojo.User;

public interface UserRoleService {
 
    public void setRoles(User user, long[] roleIds);
    public void deleteByUser(long userId);
    public void deleteByRole(long roleId);
     
}