package com.company;
import java.util.Scanner;

public class Program_to_Print_Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int table,result;

        System.out.println("Enter any table you want to print");
        table = sc.nextInt();


            for( int a=1; a<=10; a++ )

            {

                result = table * a;

                System.out.println( table+ "*" +a+ "=" +result);
            }

    }
}
