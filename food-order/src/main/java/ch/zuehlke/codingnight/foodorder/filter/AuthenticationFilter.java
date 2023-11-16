package ch.zuehlke.codingnight.foodorder.filter;

import jakarta.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(Integer.MIN_VALUE)
public class AuthenticationFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(AuthenticationFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("Authentication Filter hit before");
        chain.doFilter(request, response);
    }
}
