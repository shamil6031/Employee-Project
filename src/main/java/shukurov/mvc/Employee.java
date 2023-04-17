package shukurov.mvc;

import shukurov.mvc.validation.ChechMail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 3, max = 10 ,message = "Don't use less than 3 symbols and more than 10 symbols")
    private String name;
    @NotBlank(message = "Don't use space")
    private String surname;
    @Min(value = 300,message = "Don't less than 300")
    @Max(value = 10000,message = "Don't big than 300")
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String carBrand;
    private Map<String,String> carbrands;
    private String []languages;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @ChechMail(value = "mail.ru",message = "Mail must be end with mail.ru")
    private String mail;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarbrands() {
        return carbrands;
    }

    public void setCarbrands(Map<String, String> carbrands) {
        this.carbrands = carbrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology","IT");
        departments.put("Sales","Sales");
        departments.put("Human Resources","HR");
        departments.put("Fehle","F");

        carbrands = new HashMap<>();
        carbrands.put("Audi","Audi");
        carbrands.put("BMW","BMW");
        carbrands.put("Mercedes","Mercedes");
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
