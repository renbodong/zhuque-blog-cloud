package com.github.oauth.biz.grant;

import com.github.authority.dto.auth.LoginParamDTO;
import com.github.zhuque.core.base.R;
import com.github.zhuque.core.utils.StrHelper;
import com.github.zhuque.jwt.model.AuthInfo;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/6/1 0:43
 */
public interface TokenGrant {
    R<AuthInfo> grant(LoginParamDTO loginParamDTO);

    default R<AuthInfo> login(LoginParamDTO loginParamDTO){
         if(StrHelper.isAnyBlank(loginParamDTO.getAccount(),loginParamDTO.getPassword())){
               return R.fail("用户名或密码错误");
         }


         return null;
    }
}
