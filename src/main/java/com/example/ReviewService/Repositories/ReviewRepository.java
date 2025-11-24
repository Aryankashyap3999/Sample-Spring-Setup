package com.example.ReviewService.Repositories;

import com.example.ReviewService.models.Driver;
import com.example.ReviewService.models.Passenger;
import com.example.ReviewService.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.geom.Arc2D;
import java.util.Date;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    // Match property type Double instead of Integer
    Double countAllByRatingIsLessThanEqual(Double givenRating);

    // Use a valid prefix: findAllBy...
    List<Review> findAllByRatingIsLessThanEqual(Double givenRating);

    // This one is already fine: createdAt is in BaseModal
    List<Review> findAllByCreatedAtBefore(Date date);

    @Query("select r from Booking b inner join Review r on b.review = r where b.id = :bookingId")
    Review findReviewByBookingId(Long bookingId);

    @Query("select new com.example.ReviewService.Repositories(r, p, d) from Booking b inner join Passenger p inner join Driver d")
    custom findDriverPassengerReviewByBookingId(Long bookingId);

}


class custom {
    public Review review;
    public Passenger passenger;
    public Driver driver;

    public custom(Review review, Passenger passenger, Driver driver) {
        this.review = review;
        this.passenger = passenger;
        this.driver = driver;
    }

}

