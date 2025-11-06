package com.example.ReviewService.services;

import com.example.ReviewService.Repositories.ReviewRepository;
import com.example.ReviewService.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**************");
        Review r = Review.builder().content("Amazon ride").rating(5.0).build();
        reviewRepository.save(r); // this code execute sql query

        List<Review> reviews = reviewRepository.findAll();
        for(Review review: reviews) {
            System.out.println(review.getContent());
        }
    }
}
