package com.github.oauth.biz.grant.tokengrantImpl;

import com.github.authority.dto.auth.LoginParamDTO;
import com.github.oauth.biz.grant.AbstractTokenGrant;
import com.github.zhuque.core.base.R;
import com.github.zhuque.jwt.model.AuthInfo;
import org.springframework.stereotype.Service;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/6/1 23:24
 */
@Service()
public class CaptchaTokenGrantImpl extends AbstractTokenGrant {

    @Override
    public R<AuthInfo> grant(LoginParamDTO loginParamDTO) {
        login(loginParamDTO);
        return null;
    }
}
