package com.example.springcloudconfigclientsample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RefreshScope
public class IndexController {

    @Value("${message.title}")
    private String title;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("title", title);
        return "index";
    }
}
