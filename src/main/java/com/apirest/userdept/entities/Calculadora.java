package com.apirest.userdept.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculadora {

    private static Logger log  = LoggerFactory.getLogger(Calculadora.class);

    public int soma(int x, int y){
        log.info("soma entre "  + x + " + " + y );
        return  x + y;
    }
    public int divisao(int a, int b){
        return a/b;
    }

    private static Integer calculo(int x, int y){

        int calc = 0;

        if(x % 2 == 0){
            calc = x + y;
        }
        else{
            calc = x * y;
        }
        return  calc;
    }
}
