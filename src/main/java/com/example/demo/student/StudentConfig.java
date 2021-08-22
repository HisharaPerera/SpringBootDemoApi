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
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hishara = new Student(
                    "Hishara",
                    "hisharaperera@gmail.com",
                    LocalDate.of(1992, Month.JULY, 8)
            );

            Student bhanuka = new Student(
                    "Bhanuka",
                    "bhanukathirimanne@gmail.com",
                    LocalDate.of(1993, Month.JANUARY, 2)
            );

            Student pushpika = new Student(
                    "Pushpika",
                    "pushpikawanniachchi@gmail.com",
                    LocalDate.of(1992, Month.DECEMBER, 8)
            );

            repository.saveAll(
                    List.of(hishara, bhanuka, pushpika)
            );
        };
    }
}
