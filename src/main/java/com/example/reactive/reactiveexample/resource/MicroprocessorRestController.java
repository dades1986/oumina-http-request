package com.example.reactive.reactiveexample.resource;

import com.example.reactive.reactiveexample.entity.Microprocessor;
import com.example.reactive.reactiveexample.repository.MircoprocessorRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/microprocessor")
public class MicroprocessorRestController {

    @Autowired
    private MircoprocessorRepositoryImpl mircoprocessorRepository;


    @GetMapping
    public Flux<ServerSentEvent<String>> getResult(){
        return Flux.interval(Duration.ofSeconds(1))
                .map(sequence -> ServerSentEvent.<String> builder()
                        .id(String.valueOf(sequence))
                        .event("Model ")
                        .data("test "+ LocalDateTime.now())
                        .build());
    }
}
