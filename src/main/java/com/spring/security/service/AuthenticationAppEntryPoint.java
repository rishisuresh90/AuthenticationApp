package com.spring.security.service;

import com.spring.controller.AuthenticationController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by apple on 10/06/17.
 */
@Component
public class AuthenticationAppEntryPoint implements AuthenticationEntryPoint {

    private final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    @Override
    public void commence(HttpServletRequest httpServletRequest,
                         HttpServletResponse httpServletResponse,
                         AuthenticationException e) throws IOException, ServletException {

        logger.info("Entered commence()...");

        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized User Access");
    }
}
