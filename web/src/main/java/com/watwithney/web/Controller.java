package com.watwithney.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Controller {

        @GetMapping("/deploy")
        public String deploy (){
            return" Herokun deploy";
        }
    }

