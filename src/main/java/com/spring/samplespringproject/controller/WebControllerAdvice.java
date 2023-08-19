package com.spring.samplespringproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.samplespringproject.helper.AjaxMessage;
import com.spring.samplespringproject.helper.ErrorMessage;

@ControllerAdvice(basePackages = { "com.spring.samplespringproject.controller.web" })
public class WebControllerAdvice {
    private final String defautlExceptionView = "/error/exception";

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String nullException(Exception ex, AjaxMessage message, RedirectAttributes redirectAttributes) {
        message.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        message.setTitle(ErrorMessage.INTERNAL_ERROR.getValue());
        message.setDetail(ex.getMessage().toString());
        redirectAttributes.addAttribute("message", message);

        return "Redirect: " + this.defautlExceptionView;
    }
}
