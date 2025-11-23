package com.example.ReviewService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModal {
    private String name;

    @OneToMany(mappedBy = "passenger", fetch = FetchType.LAZY)
    @Builder.Default
    @Fetch(FetchMode.SUBSELECT)
    private List<Booking> bookings = new ArrayList<>();
}
