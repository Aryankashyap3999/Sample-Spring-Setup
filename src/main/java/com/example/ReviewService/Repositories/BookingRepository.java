package com.example.ReviewService.Repositories;

import com.example.ReviewService.models.Booking;
import com.example.ReviewService.models.Driver;
import com.example.ReviewService.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {



}

