package com.techreturners.exercise002;


public class Exercise002 {

    public boolean isFromManchester(Person person) {
        // Add your code here
        if(person.city == "Manchester"){
            System.out.println(person.firstName+" is from Manchester.");
            return true;
        }
        else{
            System.out.println(person.firstName+" is not from Manchester.");
            return false;
        }
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        // Add your code here
        if(person.age >= ageLimit){
            System.out.println(person.firstName + " can watch movie");
            return true;
        }
        else{
            System.out.println(person.firstName + " can watch movie");
            return false;
        }
    }
    
}
