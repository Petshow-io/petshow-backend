package com.io.petshow.petshops;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;


@FieldDefaults(makeFinal = true)
@NoArgsConstructor(force = true)
@Getter
public class PetshopDTO {

    private String id;

    private String name;

    private String email;

    private String address;

    private LocalTime openTime;

    private LocalTime closedTime;
}
