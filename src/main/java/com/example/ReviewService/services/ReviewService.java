package com.example.ReviewService.services;

import com.example.ReviewService.Repositories.BookingRepository;
import com.example.ReviewService.Repositories.DriverRepository;
import com.example.ReviewService.Repositories.ReviewRepository;
import com.example.ReviewService.models.Booking;
import com.example.ReviewService.models.Driver;
import com.example.ReviewService.models.Review;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReviewService implements CommandLineRunner {

    private  ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;
    private final DriverRepository driverRepository;

    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository, DriverRepository driverRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }

    @Override
    @Transactional
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
//        Optional<Booking> b = bookingRepository.findById(252L);
//        if(b.isPresent()) {
//            bookingRepository.delete(b.get());
//        }
//        Optional<Driver> driver = driverRepository.findByIdAndLicenseNumber(1L, "DL2121");
//        if(driver.isPresent()) {
//            System.out.println(driver.get().getName());
//            List<Booking> bookings = bookingRepository.findAllByDriverId(1L);
//            for(Booking booking: bookings) {
//                System.out.println(booking.getBookingStatus());
//            }
            // this gives join query.
//        }


//        List<Long> driverIds = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 8L, 9L, 10L));
//        List<Driver> drivers = driverRepository.findAllByIdIn(driverIds);
//
////        List<Booking> bookings = bookingRepository.findAllByDriverIn(drivers); // custom implementation for N+1 problem
//
//
//
//        for(Driver driver : drivers) {
//            List<Booking> bookings = driver.getBooking();
//            bookings.forEach(booking -> System.out.println(booking.getId()));
//        }

    }
}
