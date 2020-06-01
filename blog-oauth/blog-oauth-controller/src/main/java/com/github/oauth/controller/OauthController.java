package com.github.oauth.controller;

import com.github.authority.dto.auth.LoginParamDTO;
import com.github.oauth.biz.grant.TokenGrant;
import com.github.oauth.biz.grant.TokenGrantBuilder;
import com.github.zhuque.core.base.R;
import com.github.zhuque.jwt.model.AuthInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/31 23:04
 */
@RestController
@RequestMapping("/anno")
@Api(value = "用户授权认证",tags = "登录接口")
public class OauthController {
    @Autowired
    private TokenGrantBuilder builder;


    @ApiOperation(value = "获取认证token",notes = "登陆或者清空缓存时调用")
    @PostMapping(value = "token")
    public R<AuthInfo> login(@Validated @RequestBody LoginParamDTO loginParamDTO){
       String grantType = loginParamDTO.getGrantType();
        TokenGrant tokenGrant = builder.getTokenGrant(grantType);
        R<AuthInfo> grant = tokenGrant.grant(loginParamDTO);
        return grant;
    }
}
