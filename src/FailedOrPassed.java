/* QUESTION
Write a program that asks a user for a test score to determine if a student "passes" or "failed"
the test where 60 is the cut line; meaning 59 is fail.

it will continue until user types -1 to terminate
 */

/*PSEUDO-CODE
1. prompt user to enter test score and store it to integer variable x
1.1 valid =  proceed to step 2, invalid = display error message
2. if score is equal or greater than 60
3. display passed
4.else display failed
5. tell user to type "-1" if they want to terminate or else keep checking test scores
5.1 if they type -1 then exit loop thanking the user
6. repeat step 1
 */

/*
input positive integer from user, output failed or passed, process = if conditon to check
 validity of number entered and do while loop to do perform the task.
 */

/*
variables needed: x
 */

import java.util.Scanner;

public class FailedOrPassed {
    public static void main(String[] args) {

        Scanner keybd = new Scanner(System.in);
        int x;


        System.out.println("Please enter the score you want to check: or type '-1' to terminate");
        x = keybd.nextInt();
        do {
            if (x == -1) {
                break;
            }
            if (x < 0 || x > 100) {
                System.out.println("invalid");
            } else if (x > 60) {
                System.out.println(" passed");
            } else {
                System.out.println("failed");
            }

        }while(x>=0);

    }
}
