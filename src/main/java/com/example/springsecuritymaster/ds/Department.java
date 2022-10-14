package com.example.springsecuritymaster.ds;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min = 2,max = 5,message = "Code length must be between 2 and 5")
    @Pattern(regexp = "[A-Za-z ]*",message = "Code contains illegal characters")
    private String code;

    @NotBlank(message = "Name cannot be empty.")
    @Pattern(regexp = "[A-Za-z-']*",message = "Name contains illegal characters.")
    private String name;

    @NotBlank(message = "Country cannot be empty.")
    @Pattern(regexp = "[A-Za-z-']*",message = "Country contains illegal characters.")
    private String country;

    public Department() {
    }

    public Department(String code, String name, String country) {
        this.code = code;
        this.name = name;
        this.country = country;
    }
}
