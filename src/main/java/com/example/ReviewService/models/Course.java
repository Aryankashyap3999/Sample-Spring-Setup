package com.example.ReviewService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course extends BaseModal{
    private String name;

    @ManyToMany
    @Builder.Default
    List<Student> students = new ArrayList<>();
}
