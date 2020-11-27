package com.microservicio.dividir.controllers;
import com.microservicio.dividir.services.CalculaDivisionServicio;
import com.microservicio.dividir.models.OperadoresDigitos;
import org.springframework.web.bind.annotation.*;

/**
 * @author Felipe Garrido
 */
@RestController
public class PrincipalControlador {

    @PostMapping(value = "/divide", consumes = "application/json", produces = "application/json")
    public OperadoresDigitos dividir(@RequestBody OperadoresDigitos operadoresDigitos) throws Exception {
        CalculaDivisionServicio calculaDivision = new CalculaDivisionServicio();
        OperadoresDigitos operadoresDigitosRetorno = calculaDivision.calcularDivision(operadoresDigitos);
        return operadoresDigitosRetorno;
    }
}
