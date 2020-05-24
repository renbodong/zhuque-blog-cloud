package com.github.test.controller.controller;

import com.github.zhuque.security.annnotation.LoginUser;
import com.github.zhuque.security.model.SysUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/20 0:39
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @PostMapping("/test1")
    public void test1(@LoginUser SysUser sysUser){
        System.out.println("测试通过注解获取当前登录用户信息成功");
    }
}
