package com.spring.samplespringproject.controller.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.samplespringproject.annotation.WebController;
import com.spring.samplespringproject.helper.ResourceReturnToView;
import com.spring.samplespringproject.helper.ViewUtil;

@WebController
@RequestMapping("/home")
public class HomeController {

    @GetMapping({ "", "/" })
    public String index(Model model) {
        ResourceReturnToView.getModel(model);
        return ViewUtil.HOME;
    }

}
