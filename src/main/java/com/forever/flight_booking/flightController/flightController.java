package com.forever.flight_booking.flightController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flightController {
    @GetMapping(value = "/hello")
    public String greet(){
        return "Hello World!";
    }
}
