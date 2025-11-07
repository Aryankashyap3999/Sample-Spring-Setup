package com.example.ReviewService.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModal{

    @OneToOne(cascade = {CascadeType.PERSIST})
    private Review review; // has a relationship means composition in that case you have to give annotation for showing relationship

    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;
    private long totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;


}
