package com.github.oauth.controller;

import com.github.oauth.biz.service.UserService;
import com.github.zhuque.core.base.R;
import com.github.zhuque.security.feign.UserQuery;
import com.github.zhuque.security.model.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/30 0:38
 */
@RestController
@RequestMapping("/user")
@Slf4j
@Api(value = "user",tags = "用户")
public class OauthUserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户详情",notes = "查询用户详情")
    @PostMapping(value = "/anno/id/{id}")
    public R<SysUser> getById (@PathVariable(name = "id") Long id, @RequestBody UserQuery userQuery){
        return userService.getSysUserById(id, userQuery);
    }
}
