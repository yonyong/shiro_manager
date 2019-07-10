package cn.yonyong.shiro.manager.service;

import cn.yonyong.shiro.manager.pojo.Permission;
import cn.yonyong.shiro.manager.pojo.Role;

import java.util.List;
import java.util.Set;

public interface PermissionService {
    public Set<String> listPermissions(String userName);
 
    public List<Permission> list();
    public void add(Permission permission);
    public void delete(Long id);
    public Permission get(Long id);
    public void update(Permission permission);
 
    public List<Permission> list(Role role);
     
}