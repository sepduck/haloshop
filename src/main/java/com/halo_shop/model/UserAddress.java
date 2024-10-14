package com.halo_shop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "user_address")
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address")
    private String address;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private AddressCitys city;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private AddressCountries countries;

    @ManyToOne
    @JoinColumn(name = "ward_id")
    private AddressWards wards;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
