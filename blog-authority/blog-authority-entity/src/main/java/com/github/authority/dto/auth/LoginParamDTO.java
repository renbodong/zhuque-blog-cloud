package com.github.authority.dto.auth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author zhuque
 * @version 1.0
 * @date 2020/5/31 23:58
 */
@Data
@Builder
@ApiModel(value = "LoginParamDTO",description = "登录参数")
public class LoginParamDTO {
    @ApiModelProperty("验证码KEY")
    private String key;
    @ApiModelProperty("验证码")
    private String code;
    @ApiModelProperty("账号")
    private String account;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty(value = "授权类型",example = "captcha",allowableValues = "captcha,refresh_token,password")
    @NotEmpty(message = "授权类型不能为空")
    private String grantType;
    @ApiModelProperty(value = "刷新token")
    private String refreshToken;
}
