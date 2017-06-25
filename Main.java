package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter number of digits you want to be shown: ");
        System.out.print(showPI(loadPrecision()));
    }

    public static String showPI(int precision){
        return String.format("%." + precision + "f", Math.PI);
    }

    public static int loadPrecision(){
        Scanner load = new Scanner(System.in);
        return load.nextInt();
    }
}
