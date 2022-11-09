package com.COGNIZANT.VEHICLES.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "user-details")
public class User {
    @Id
    private  Long id;
    private  String licenceNumber;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Vehicle vehicle;

}