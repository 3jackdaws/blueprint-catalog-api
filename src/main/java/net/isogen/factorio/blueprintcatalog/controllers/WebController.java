package net.isogen.factorio.blueprintcatalog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
