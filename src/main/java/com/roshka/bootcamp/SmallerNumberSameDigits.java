package com.roshka.bootcamp;

public class SmallerNumberSameDigits {
    public static long nextSmaller(long n)
    {
        String number = Long.toString(n);
        //ordeno 
        char[] array = number.toCharArray();
        java.util.Arrays.sort(array);
        long i=n;
   
        while (true){
            i--;

            if(i<0){
                return -1;
            }
            //paso a cadena para i 
            String numberi = Long.toString(i);

            //ordeno
            char[] arrayi = numberi.toCharArray();

            java.util.Arrays.sort(arrayi);

            //comparo
            if(java.util.Arrays.equals(arrayi, array)){
                return i;
            }
   

        }

    }
}