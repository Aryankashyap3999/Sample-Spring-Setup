package com.example.ReviewService.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_review")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // In this inheritance type only one giant table has been created and all attributes of parent and child class come in it.
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // parent class also has dedicated table and child has their own table.
@Inheritance(strategy = InheritanceType.JOINED) // no redundancy other than this all same as TABLE_PER_CLASS.
public class Review extends BaseModal{


    @Column(nullable = false)
    private String content;
    private Double rating;



}
