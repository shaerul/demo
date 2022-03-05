package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {

        return args-> {

            Student shaerul = new Student(
                    //1L,
                    "Shaerul Haque Joarder",
                    "shaerul@gmail.com",
                    LocalDate.of(1974, Month.MAY, 5),
                    21
            );

            Student alex = new Student(
                    //2L,
                    "Alex Joarder",
                    "alex@gmail.com",
                    LocalDate.of(1971, Month.JANUARY, 15),
                    28
            );

            Student bala = new Student(
                    //2L,
                    "Bala Hori Podder",
                    "bala@gmail.com",
                    LocalDate.of(1971, Month.MARCH, 17),
                    34
            );

            repository.saveAll(List.of(shaerul,alex,bala));

        };
    }
}
