package com.example.ReviewService.services;

import com.example.ReviewService.Repositories.BookingRepository;
import com.example.ReviewService.Repositories.ReviewRepository;
import com.example.ReviewService.models.Booking;
import com.example.ReviewService.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private  ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("**************");
//        Review r = Review.builder().content("Amazon ride").rating(5.0).build();
//
//        Booking b = Booking.builder().review(r).endTime(new Date()).build();
//
//
//
//        //reviewRepository.save(r); // this code execute sql query insert
//
//        bookingRepository.save(b);
//
//        List<Review> reviews = reviewRepository.findAll();
//        for(Review review: reviews) {
//            System.out.println(review.getContent());
//        }
        Optional<Booking> b = bookingRepository.findById(252L);
        if(b.isPresent()) {
            bookingRepository.delete(b.get());
        }
    }
}
