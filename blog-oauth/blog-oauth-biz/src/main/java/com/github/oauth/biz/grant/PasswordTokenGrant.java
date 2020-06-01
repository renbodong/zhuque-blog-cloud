package com.github.oauth.biz.grant;

import com.github.authority.dto.auth.LoginParamDTO;
import com.github.zhuque.core.base.R;
import com.github.zhuque.jwt.model.AuthInfo;
import org.springframework.stereotype.Component;


/**
 * 密码登录认证器
 * @author zhuque
 * @version 1.0
 * @date 2020/6/1 0:52
 */
@Component("password")
public class PasswordTokenGrant implements TokenGrant {
    @Override
    public R<AuthInfo> grant(LoginParamDTO loginParamDTO) {
        return login(loginParamDTO);
    }
}
