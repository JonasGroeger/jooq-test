package de.jonasgroeger.jooqtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneOffset;
import java.util.TimeZone;

@SpringBootApplication
@RestController
public class JooqTestApplication {

    public static void main(String[] args) {
        // Use UTC
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneOffset.UTC));

        SpringApplication.run(JooqTestApplication.class, args);
    }

    @GetMapping(value = "/hello")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping(value = "/hello2")
    public ResponseEntity<String> demo2() {
        return ResponseEntity.ok("Hello World 2!");
    }
}
