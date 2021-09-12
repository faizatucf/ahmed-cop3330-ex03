/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;
public class quotes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String quote, author; 
        System.out.println("What is the quote?");
        quote = sc.nextLine(); //accepting input from user
        System.out.println("Who said it?");
        author = sc.nextLine(); //accepting input from user
        //System.out.println(String.format("%s says, \"%s\"", author, quote));
        //formatting and printing output in a single output statement 
        System.out.println(author.concat(" says, ").concat("\"").concat(quote).concat("\""));
    }
}
