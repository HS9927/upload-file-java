package com.spring.samplespringproject.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

public class ResourceReturnToView {
    public final static void getModel(Model model) {
        model.addAttribute("css", getCSSModel());
        model.addAttribute("js", getJSModel());
    }

    public final static List<String> getCSSModel() {
        String prefix = "/plugins/";
        List<String> link = new ArrayList<>();
        /// Sample: link.add(prefix + "");

        /// Bootstrap min css
        link.add(prefix + "bootstrap-5.3.1/css/bootstrap.min.css");
        /// Bootstrap Icon min css
        link.add(prefix + "bootstrap-icons-1.10.5/font/bootstrap-icons.min.css");

        /// Return List
        return link;
    }

    public final static List<String> getJSModel() {
        String prefix = "/plugins/";
        List<String> link = new ArrayList<>();
        /// Sample: link.add(prefix + "");

        /// Jquery min js
        link.add(prefix + "jquery-7.3.0/jquery.min.js");
        /// Bootstrap min js
        link.add(prefix + "bootstrap-5.3.1/js/bootstrap.min.js");
        /// Bootstrap Bundle min js
        link.add(prefix + "bootstrap-5.3.1/js/bootstrap.bundle.min.js");

        /// Return List
        return link;
    }
}