package com.example.ReviewService.Repositories;

import com.example.ReviewService.models.CustomDriver;
import com.example.ReviewService.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber); // This is for where queries.

//    @Query(nativeQuery = true, value = "SELECT * FROM Driver WHERE id = :id AND license_number = :license") // Raw mysql query error throw at runtime
//    Optional<Driver> rawFindByIdAndLicenseNumber(Long id, String license);
//
//    @Query("FROM Driver as d WHERE d.id = :id AND d.license_number = :ln") // hibernate query, error is throw at compile time
//    Optional<Driver> rawFindByIdAndLicense(Long id, String ln);
//
//    @Query("SELECT new com.example.reviewservice.models.CustomDriver(d.id, d.name) From Driver d where d.licenseNumber = :license and d.id = :id")
//    CustomDriver hqlFindByIdAndLicense(String license, Long id);

    List<Driver> findAllByIdIn(List<Long> driverIds);

}
