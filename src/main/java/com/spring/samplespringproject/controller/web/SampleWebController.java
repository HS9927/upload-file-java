package com.spring.samplespringproject.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.samplespringproject.helper.ResourceReturnToView;
import com.spring.samplespringproject.helper.ViewUtil;

@Controller
public class SampleWebController {
    @GetMapping({ "", "/" })
    public String index(Model model) {
        ResourceReturnToView.getModel(model);
        return ViewUtil.DASHBOARD;
    }
}
