package com.techreturners.exercise002;

public class Person{
    String firstName;
     String lastName;
      String city;
      int age;

      public Person(String fName, String lName, String cityName, int personAge){
      firstName  = fName;
      lastName = lName;
      city = cityName;
      age = personAge;
  }

  public String getCity(){
    return city;
  }

  public int getAge(){
    return age;
  }
}