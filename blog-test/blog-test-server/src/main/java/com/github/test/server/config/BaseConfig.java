package com.github.test.server.config;

import com.github.test.server.undertow.UndertowServerFactoryCustomizer;
import io.undertow.Undertow;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * 基础配置类
 *
 * @author zuihou
 * @date 2019-06-22 22:53
 */
//@AutoConfigureBefore(JacksonAutoConfiguration.class)
public abstract class BaseConfig {


    @Bean
    @ConditionalOnClass(Undertow.class)
    public UndertowServerFactoryCustomizer getUndertowServerFactoryCustomizer() {
        return new UndertowServerFactoryCustomizer();
    }

}
