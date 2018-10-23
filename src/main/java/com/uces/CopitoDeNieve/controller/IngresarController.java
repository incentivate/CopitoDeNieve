package com.uces.CopitoDeNieve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IngresarController {

    @RequestMapping(value = "/ingresar")
    public String ingresar(){

        return "ingresar";
    }

}
