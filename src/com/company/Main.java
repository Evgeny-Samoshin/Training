package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int number = scanner.nextInt();
        int sum=0;
        while (number>0){
                sum+=(number%10);
                number/=10;
                if ((number==0)&&(sum>9)){
                    number=sum;
                    sum=0;
                }
        }
        System.out.println(sum);

        }

}