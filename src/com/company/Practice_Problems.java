package com.company;
import java.util.Scanner;

public class Practice_Problems {
    public static void main(String[] args) {

                        //PROBLEM 1: A program to print * pattern

//    int n=12;
//
//        for (int i=n; i>0; i--)
//        {
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

                        //PROBLEM 2: sum of first n even number using for loop

/*        Scanner sc = new Scanner(System.in);

        int sum=0;

        System.out.println("Please Enter the Number through you want to sum even numbers from 0 to n");
        int n=sc.nextInt();

        for (int i=0; i<n; i++)
        {
            sum= sum+(2*i);
        }
        System.out.println("Sum of Even Number is "+sum);*/

        //PROBLEM 3: sum of first n even number using while loop

        /*Scanner sc = new Scanner(System.in);

        int sum=0;
        int i=0;

        System.out.println("Please Enter the Number through you want to sum even numbers from 0 to n");
        int n=sc.nextInt();

        while (i<n)
        {
            sum= sum+(2*i);
            i++;
        }
        System.out.println("Sum of Even Number is "+sum); */

                          //PROBLEM 4: table

   /*     int result;

     Scanner sc = new Scanner(System.in);


        System.out.println("Please enter the number of table you want to print: ");
        int table=sc.nextInt();
        for (int i=1; i<=10; i++)
        {
            result = table*i;
            System.out.println( table+ "*" +i+ "=" +result);
            //or

            //System.out.println(table+"*"+i+"=" +table*i);
        }

    */

                        //PROBLEM 5: table in reverse order
     /*   Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of table you want to print in reverse order: ");
        int table=sc.nextInt();
        for (int i=10; i>=1; i--)
        {

            System.out.println(table+"*"+i+"=" +table*i);
        }*/

                         //PROBLEM 6: factorial of n            such tha factorial is n = n*n-1 * n-2 ... 1

      Scanner sc = new Scanner(System.in);
//                                                              5! = 5*4*3*2*1 = 120
        System.out.println("Please enter the number you want to calculate the factorial ");
        int n=sc.nextInt();

        int fact=1;
        int i=1;
        while (i<=n)
        {
            fact*=i;
            i++;

        }
        System.out.println(fact);

                            //PROBLEM 7: addition of table of n

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter the number of table you want to print in reverse order: ");
//        int table=sc.nextInt();
//
//        int sum= 0;
//
//        for (int i=1; i<=10; i++)
//        {
//            sum =sum+(table*i);
//        }
//        System.out.println(sum);



    }
}
