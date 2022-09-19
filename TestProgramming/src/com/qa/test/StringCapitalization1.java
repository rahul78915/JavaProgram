package com.qa.test;

public class StringCapitalization1 {
	
	
	 // create a string
    String str = "this is java code";
    String words[]=str.split("\\s");
    String capitalizeStr="";

    for(String word:words){
        // Capitalize first letter
        String firstLetter=word.substring(0,1);
        // Get remaining letter
        String remainingLetters=word.substring(1);
        capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
    }
    System.out.println(capitalizeStr);
}
}
//public static String capitalizeWord(String str){  
//String words[]=str.split("\\s");  
//String capitalizeWord="";  
//for(String w:words){  
//    String first=w.substring(0,1);  
//    String afterfirst=w.substring(1);  
//    capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
//}  
//return capitalizeWord.trim();  
//}  
//}  


//public class TestStringFormatter {  
//public static void main(String[] args) {  
//    System.out.println(StringFormatter.capitalizeWord("my name is khan"));  
//    System.out.println(StringFormatter.capitalizeWord("I am sonoo jaiswal"));  
//    }  
//}  