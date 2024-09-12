package com.apirest.userdept.entities;

public class Calculadora {

    public int soma(int x, int y){
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
