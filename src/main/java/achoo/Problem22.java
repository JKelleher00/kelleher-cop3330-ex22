package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem22 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = a.nextInt();
        System.out.print("Enter the second number: ");
        int second = a.nextInt();
        System.out.print("Enter the third number");
        int third = a.nextInt();
        if(first == second || second == third || third == first)
            System.exit(-1);
        if(first > second){
            if(first>third)
                System.out.println("The biggest number is "+first);
            else System.out.println("The biggest number is "+third);
        }
        else{
            if(second>third)
                System.out.println("The biggest number is "+second);
            else System.out.println("The biggest number is "+third);
        }
    }
}
