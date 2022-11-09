package com.COGNIZANT.VEHICLES.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicle_detail")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Bikeid;
    private String plateNumber;
    private String manufacture;
    private String Biketype;
    private String Bikecolor;
    private String BikeRegistrationDate;
    private String pendingFines;
   @OneToOne
   @JoinColumn(name="id")
    private User user;
}