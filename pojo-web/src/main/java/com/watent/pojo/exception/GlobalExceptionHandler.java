package com.watent.pojo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@ControllerAdvice
class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName(DEFAULT_ERROR_VIEW);
//        return mav;
//    }

//    @ExceptionHandler(value = Exception.class)
//    private String runtimeExceptionHandler(HttpServletRequest req, Exception e) {
//
//        return DEFAULT_ERROR_VIEW;
//    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private <T> RestResult<T> ExceptionHandler() {

        return RestResult.genErrorResult(ErrorCode.SYSTEM_ERROR);
    }

    @ResponseBody
    @ExceptionHandler(value = PojoException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private <T> RestResult<T> PojoExceptionHandler() {

        return RestResult.genErrorResult(ErrorCode.POJO_ERROR);
    }
}