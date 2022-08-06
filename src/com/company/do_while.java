package com.company;

public class do_while {
    public static void main(String[] args) {

                // do-while loop also executes a set of statements repeatedly (iterates) until given condition remains true.

                // but here the condition is checked at the end.

                // Program control executes the block of code first and then checks the given condition, if condition evaluates to true loop iterates again

        int a=1;

        do
        {
            System.out.println("Welcome to Java Programming"+a);
            a++;
        }

        while (a<=10);                      // don't forget to add semicolon at the edn of while

// i write wrong condition in above while, to get know that do-while loop even executes once if the condition is false

    }
}
