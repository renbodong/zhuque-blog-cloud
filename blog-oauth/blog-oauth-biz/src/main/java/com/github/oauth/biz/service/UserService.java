package com.github.oauth.biz.service;

import com.github.zhuque.core.base.R;
import com.github.zhuque.security.feign.UserQuery;
import com.github.zhuque.security.model.SysUser;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/31 14:29
 */
public interface UserService {
    /**
     * 根据id查询用户详情
     * @param id
     * @param userQuery
     * @return
     */
    R<SysUser> getSysUserById(Long id, UserQuery userQuery);
}
