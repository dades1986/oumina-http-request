package com.example.reactive.reactiveexample.repository;

import com.example.reactive.reactiveexample.entity.Microprocessor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class MircoprocessorRepositoryImpl {

    private List<Microprocessor> microprocessors;

    {
        microprocessors= Arrays.asList(new Microprocessor(1L,"model1", LocalDate.now()),
                new Microprocessor(1L,"model1", LocalDate.now()),
                new Microprocessor(1L,"model1", LocalDate.now()));
    }
    public List<Microprocessor> getList(){
        return microprocessors;
    }
}
