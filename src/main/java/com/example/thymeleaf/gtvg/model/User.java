package com.example.thymeleaf.gtvg.model;

public class User {
  private final String firstName;
  private final String lastName;
  private final String nationality;
  private final Integer age;

  public User(String firstName, String lastName, String nationality, Integer age) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.nationality = nationality;
    this.age = age;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public String getNationality() {
    return this.nationality;
  }

  public Integer getAge() {
    return this.age;
  }
}
