package com.longg.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author long
 * @date 2020/10/12
 *
 * 自定义的乱码过滤器
 */
public class EncodingFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");

        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
