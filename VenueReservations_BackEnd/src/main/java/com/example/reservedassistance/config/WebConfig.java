package com.example.reservedassistance.config;

import com.example.reservedassistance.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Resource
    private TokenInterceptor tokenInterceptor;

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(tokenInterceptor)
                .addPathPatterns("/managers/**")
                .addPathPatterns("/users/**")
                .addPathPatterns("/superManager/**")
//                .addPathPatterns("/reset/**")
                .addPathPatterns("/uploadfile/**")
                .excludePathPatterns("/uploadfile/uploadfile")
                .excludePathPatterns("/users/register");
    }
}
