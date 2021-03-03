package com.techreturners.exercise001;

import java.util.List;
import java.lang.Math;
public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        char[] Arr = word.toCharArray();
        if(Arr[0] == Character.toUpperCase(Arr[0])){
           System.out.println(word + " : "+new String(Arr));
            return (new String(Arr));
        }
        else{
             Arr[0] = Character.toUpperCase(Arr[0]);
            System.out.println(word + " : "+ new String(Arr));
            return (new String(Arr));
            
        }
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        System.out.println(firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase());
        return (firstName.substring(0,1).toUpperCase()+"."+lastName.substring(0,1).toUpperCase());
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double totalPrice = originalPrice + (double) Math.round((originalPrice*(vatRate/100)*100))/100;
        return totalPrice;
    }
 
    public String reverse(String sentence) {
        // Add your code here        
        char[] sen = sentence.toCharArray();
        for (int i = 0; i < sen.length / 2; i++) {
           char temp = sen[i];
           sen[i] = sen[sen.length - 1 - i];
           sen[sen.length - 1 - i] = temp;
        }
        String str1=new String(sen);
        System.out.println("Reverse String");
        System.out.println(sentence +" : "+str1);
        return str1;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count=0;
        for(int i=0; i<users.size();i++){
            User u = users.get(i);
            if(u.getType()=="Linux"){
                count++;
            }
        }
        System.out.println("Total no. of Linux users : "+count);
        
        return count;
    }
}
