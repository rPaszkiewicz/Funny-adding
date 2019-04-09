package com.FunnyAdding;

public class FunnyAdding {

    private int number;
    private String intStr;
    private String reversedStr;

    public FunnyAdding(int number){
        this.number=number;
    }

    public boolean isPalindrome(){
        intStr = String.valueOf(number);
        reversedStr = "";
        for (int i=intStr.length()-1; i>=0; i--){
            reversedStr+=intStr.charAt(i);
        }
        return intStr.equals(reversedStr);
    }

    public String add(){
        int counter=0;
        while (!isPalindrome()){
            number = number + Integer.parseInt(reversedStr);
            counter++;
        }
        return "Number as a palindrome: " + intStr + ", how many calculations: " + counter;
    }
}
