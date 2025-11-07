package com.example.ReviewService.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "driver_review_id") // custom name from primary key of the table
public class DriverReview extends Review {

    @Column(nullable = false)
    private String driverReviewComment;
}
