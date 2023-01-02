package com.keremcengiz0.CarSalesProject.entities;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name = "vehicle")
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "advert_no")
    private Long advertNo;
    private String brand;
    private String series;
    private String model;
    private Long year;
    private String fuel;
    private String km;
    private String price;
    @Column(name = "advert_date", nullable = false, updatable = false)
    private LocalDate advertDate;

    @OneToOne
    private Advert advert;

    @ManyToOne
    private Category categories;

}
