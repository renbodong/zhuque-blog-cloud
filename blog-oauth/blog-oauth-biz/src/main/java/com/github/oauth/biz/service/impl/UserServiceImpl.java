package com.github.oauth.biz.service.impl;

import com.github.oauth.biz.service.UserService;
import com.github.zhuque.core.base.R;
import com.github.zhuque.security.feign.UserQuery;
import com.github.zhuque.security.model.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/31 14:30
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public R<SysUser> getSysUserById(Long id, UserQuery userQuery) {
        SysUser sysUser = SysUser.builder().name("renbddong")
                .account("renbodong111")
                .id(1L)
                .mobile("18092878343").build();
        return R.success(sysUser);
    }
}
