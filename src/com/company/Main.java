package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "radar";


        if(checkOpposite(a)){
            System.out.println("dx");
        }else{
            System.out.println("kdx");
        }

    }

    public static boolean checkOpposite(String input){
        if(input.charAt(0) != input.charAt(input.length()-1)){
            return false;
        }else{
            if(input.length() == 1){
                return true;
            }else {
                input = input.substring(1);
                input = input.replace(input.charAt(input.length() - 1), ' ');
                return checkOpposite(input.trim());
            }
        }
    }
}
