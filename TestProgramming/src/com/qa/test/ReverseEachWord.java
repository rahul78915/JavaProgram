package com.qa.test;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java akash";
        String words[] = str.split(" ");
        String reversedString = "";
  
        //Reverse each word's position
         
        for (int i = 0; i < words.length; i++) 
        {   
                reversedString = " " + words[i] + reversedString; 
        } 
  
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }


	}

// output:-Reversed string :  akash java to welcome

//public class Example
//{
//   public void reverseWordInMyString(String str)
//   {
//	/* The split() method of String class splits
//	 * a string in several strings based on the
//	 * delimiter passed as an argument to it
//	 */
//	String[] words = str.split(" ");
//	String reversedString = "";
//	for (int i = 0; i < words.length; i++)
//        {
//           String word = words[i]; 
//           String reverseWord = "";
//           for (int j = word.length()-1; j >= 0; j--) 
//	   {
//		/* The charAt() function returns the character
//		 * at the given position in a string
//		 */
//		reverseWord = reverseWord + word.charAt(j);
//	   }
//	   reversedString = reversedString + reverseWord + " ";
//	}
//	System.out.println(str);
//	System.out.println(reversedString);
//   }
//   public static void main(String[] args) 
//   {
//	Example obj = new Example();
//	obj.reverseWordInMyString("Welcome to BeginnersBook");
//	obj.reverseWordInMyString("This is an easy Java Program");
//   }
//}
//Output:
//
//Welcome to BeginnersBook
//emocleW ot kooBsrennigeB 
//This is an easy Java Program
//sihT si na ysae avaJ margorP
