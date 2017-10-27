package com.watent.pojo.filter;

import org.slf4j.MDC;

import javax.servlet.*;
import java.io.IOException;

public class AccountFilter implements Filter {

    private static final String KEY = "user";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        MDC.put(KEY, "test-100");
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }
}
