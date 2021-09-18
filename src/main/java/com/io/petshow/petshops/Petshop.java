package com.io.petshow.petshops;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.*;
import java.time.LocalTime;


@FieldDefaults(makeFinal = true)
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Petshop {

    @NotNull
    @Positive
    private String id;
    
    @NotBlank
    private String name;
    
    @Email
    private String email;

    @NotBlank
    @Size(max = 255)
    private String address;

    @PastOrPresent
    private LocalTime openTime;

    @FutureOrPresent
    private LocalTime closedTime;

}
