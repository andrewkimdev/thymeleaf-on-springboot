package kimbi.thymeleaf.gtvg.model;

public class User {
  private String firstName = null;
  private String lastName = null;
  private String nationality = null;
  private Integer age = null;

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
