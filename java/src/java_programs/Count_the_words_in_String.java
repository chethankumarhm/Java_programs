package java_programs;

import java.util.Scanner;

public class Count_the_words_in_String {
public static void main(String[] args) {
	        Scanner in= new Scanner(System.in);
	 
	        //Enter a string
	        System.out.print("Enter a String/Sentence: ");
	        String str = in.nextLine();
	        
	        //split the string into an array of words
	        String words[] = str.split(" ");
	        
	        //output the length of the array
	        System.out.println("Number of words: "+words.length);
	    }
	}


