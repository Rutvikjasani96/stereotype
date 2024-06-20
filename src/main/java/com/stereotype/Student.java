package com.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student1")
public class Student {
    @Value("Rutvik Jasani")
    private String studentName;
    @Value("Surat, Gujarat")
    private String city;
    @Value("#{address}")
    private List<String> address;

//    toString
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", addresses=" + address +
                '}';
    }
}
