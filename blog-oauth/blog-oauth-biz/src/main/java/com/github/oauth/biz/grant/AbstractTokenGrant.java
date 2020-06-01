package com.github.oauth.biz.grant;

import com.github.authority.dto.auth.LoginParamDTO;
import com.github.zhuque.core.base.R;
import com.github.zhuque.jwt.model.AuthInfo;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/6/1 23:20
 */
abstract public class AbstractTokenGrant<T> implements TokenGrant  {

    @Override
    public abstract R<AuthInfo> grant(LoginParamDTO loginParamDTO);
}
