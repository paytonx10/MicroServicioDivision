package com.microservicio.dividir.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalControlador {
    @RequestMapping("/dividir")
    public Integer dividir(@RequestParam(value="calculoDividir") String valores) {
        String[] valoresArr = valores.split(",");
        int valoresDiv = Integer.valueOf(valoresArr[0]) / Integer.valueOf(valoresArr[1]);
        System.out.println("Divicion: "+valoresDiv);
        return valoresDiv;
    }
}
