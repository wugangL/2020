package com.qf.springbootstuday.config;

import com.qf.springbootstuday.filters.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 吴
 * @Date: 2020/5/2 18:22
 */
@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean initFileBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setFilter(new MyFilter());
        return filterRegistrationBean;

    }
}
