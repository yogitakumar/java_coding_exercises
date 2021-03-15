package com.techreturners.exercise001;

import java.util.List;
import java.lang.Math;
public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1); 
    }

    public String generateInitials(String firstName, String lastName) {
        return (firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase());
    }

    public double addVat(double originalPrice, double vatRate) {
        return (originalPrice + (double) Math.round((originalPrice*(vatRate/100)*100))/100);
    }
 
    public String reverse(String sentence) {  
        String result= "";
        for(int i=sentence.length(); i>0; i--) {
            result+= sentence.charAt(i-1);
        }  
        return result;
    }

    public int countLinuxUsers(List<User> users) {
        int count=0;
        for(User user:users)
         {
             if(user.getType().equals("Linux"))
                count++;
         }
        return count;
    }
}
