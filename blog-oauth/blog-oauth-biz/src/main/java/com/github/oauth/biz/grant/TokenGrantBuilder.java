package com.github.oauth.biz.grant;

import cn.hutool.core.util.ObjectUtil;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/6/1 0:50
 */
@Component
public class TokenGrantBuilder {
    private Map<String,TokenGrant> map = new ConcurrentHashMap<>();

    public TokenGrantBuilder(Map<String, TokenGrant> tokenGrantMap) {
        tokenGrantMap.forEach(this.map::put);
    }

    public Map<String,TokenGrant> getTokenGrantMap(){
        return map;
    }

    public TokenGrant getTokenGrant(String type){
        if(StringUtils.isEmpty(type)){
            throw new IllegalStateException("get Token type error...");
        }
        TokenGrant tokenGrant = map.get(type);

        if(ObjectUtil.isEmpty(tokenGrant)){
            throw new NullPointerException("get Token tokenGrant is null");
        }
        return  tokenGrant;
    }
}
