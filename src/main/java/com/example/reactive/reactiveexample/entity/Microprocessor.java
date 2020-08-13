package com.example.reactive.reactiveexample.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Microprocessor {
    private Long id;
    private String model;
    private LocalDate creationDate;

}
