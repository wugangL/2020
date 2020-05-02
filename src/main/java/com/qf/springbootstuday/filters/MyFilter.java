package com.qf.springbootstuday.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: 吴
 * 过滤器
 * @Date: 2020/5/2 18:17
 */

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter...");
        //1.登录校验（是否有恶意攻击）
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
