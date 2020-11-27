package com.microservicio.dividir.services;
import com.microservicio.dividir.models.OperadoresDigitos;
import java.util.ArrayList;

/**
 * @author Felipe Garrido
 */
public class CalculaDivisionServicio {

    public OperadoresDigitos calcularDivision(OperadoresDigitos operadoresDigitos) throws Exception {
        OperadoresDigitos operadoresDigitosRetorno = new OperadoresDigitos();
        try {
            ArrayList<Character> operadores = operadoresDigitos.getOperadores();
            ArrayList<Integer> digitos = operadoresDigitos.getDigitos();
            for (int i = 0; i < operadores.size(); i++) {
                if (operadores.get(i) == '/') {
                    operadores.remove(i);
                    digitos.set(i, (digitos.get(i) / digitos.get(i + 1)));
                    digitos.remove(i + 1);
                    i -= 1;
                }
            }
            operadoresDigitosRetorno.setDigitos(digitos);
            operadoresDigitosRetorno.setOperadores(operadores);
        } catch (Exception e) {
            throw new Exception("Error servicio dividir: " + e.getMessage());
        }
        return operadoresDigitosRetorno;
    }
}
