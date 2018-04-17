package com.sda.builder;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserWithLombok {
    private String firstName;
    private String lastName;
    private String bithDate;
    private String phoneNumber;
}
