package com.nexign.helloJava.examples.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Person {
      protected String name;
      String lastName;
      int age;
      BigDecimal salary;
      private int wallet;

     public Person(String name, String lastName, int age, BigDecimal salary) {
          this.name = name;
          this.lastName = lastName;
          this.age = age;
          this.salary = salary;

     }

     public Person(String name, String lastName, int wallet) {
          this.name = name;
          this.lastName = lastName;
          this.wallet = wallet;
     }

     public Person() {
          this("Alex", "M", 23, BigDecimal.TEN);
     }

     public String getName() {
          return name;
     }

     public String getLastName() {
          return lastName;
     }

     public int getAge() {
          return age;
     }

     public BigDecimal getSalary() {
          return salary;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public void setSalary(BigDecimal salary) {
          this.salary = salary;
     }

     public void income(int payment) {
          this.wallet += payment;
     }

     public int pay(int cost) {
          wallet-=cost;
          return cost;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof Person person)) return false;
         return age == person.age && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(salary, person.salary);
     }

     @Override
     public int hashCode() {
          return Objects.hash(name, lastName, age, salary);
     }


     @Override
     public String toString() {
          return
                  "name='" + name + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", age=" + age +
                  ", salary=" + salary;
     }
}
