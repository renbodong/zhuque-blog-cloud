package com.github.test.controller.controller;

import com.github.zhuque.core.base.R;
import com.github.zhuque.security.annnotation.LoginUser;
import com.github.zhuque.security.model.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/20 0:39
 */
@Slf4j
@Controller
@ResponseBody
@RequestMapping("/test")
@Api(value = "TestController",tags = "测试模块")
public class TestController {
    @PostMapping("/test1")
    @ApiOperation("测试注解获取当前登录对象")
    public R<SysUser> test1(@LoginUser(isFull = true) SysUser sysUser){
        log.info("测试通过注解获取当前登录");
        return R.success(sysUser);
    }
}
