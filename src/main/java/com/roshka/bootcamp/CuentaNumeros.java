package com.roshka.bootcamp;

import java.util.*;

public class CuentaNumeros {
    //el valor de la suma de digitos
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        //creamos un minimo y un maximo para el numDigits 
        long cantidad, min, max;
        cantidad=0;
        min=0;
        max=0;


        String mayor = "";
        String menor = "";
        for (int i = 0; i < numDigits; i++) {
            mayor += "9";
            menor += "1";
        }
        //pasamos a enteros los valores de mayor y menor
        int mayorInt = Integer.parseInt(mayor);
        int menorInt = Integer.parseInt(menor);

        for (int i=menorInt; i<=mayorInt; i++) {
            boolean flag = true;
            String numero = String.valueOf(i);
            int digitoAnt=Integer.parseInt(numero.charAt(0)+"");
            long sumAux = digitoAnt;
            for(int j=1; j<numDigits; j++) {
                int digitoAct = Integer.parseInt(numero.charAt(j)+"");
                if(digitoAct < digitoAnt) {
                    flag = false;
                    break;
                } else {
                    // si es creciente
                    sumAux += digitoAct ;
                    digitoAnt = digitoAct ;
                }
            }

            if(sumAux == sumDigits && flag) {
                if(cantidad == 0) {
                    min = i;
                    max = i;;
                } else if(i > max) {
                    max = i;
                }

                cantidad++;
            }
            
        }
        if (cantidad<=0) {
            return new ArrayList<Long>();
        }
        
        List<Long> lista = new ArrayList<Long>();
        lista.add(cantidad);
        lista.add(min);
        lista.add(max);
        return lista;
        
    }
}
//Carrito de Alexis, honor 5