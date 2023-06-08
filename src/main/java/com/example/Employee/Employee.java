package com.example.Employee;
import java.lang.Override;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    public Long id;
    public String name;
    public String mail;
    public String phone;
    
    public Employee(){

    }

    public Employee(String Name, String Mail, String Phone){
        name = Name;
        mail = Mail;
        phone = Phone;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getMail(){
        return this.mail;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public void setMail(String Mail){
        this.mail = Mail;
    }
    public void setPhone(String Phone){
        this.phone = Phone;
    }
    public void setId(Long id){
        this.id = id;
    }
    @Override
    public String toString(){
        return "Employee{Name="+this.name+", Mail="+this.mail+", Phone="+this.phone+"}";
    }
}

