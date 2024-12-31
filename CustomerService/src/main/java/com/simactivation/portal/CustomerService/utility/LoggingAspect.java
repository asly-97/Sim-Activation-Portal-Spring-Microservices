package com.simactivation.portal.CustomerService.utility;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterThrowing(pointcut = "execution(* com.simactivation.portal.*.service.*Service.*(..))",throwing = "e")
    public void logServiceException(Exception e){
        logger.log(Level.SEVERE,e.getMessage());
    }
}