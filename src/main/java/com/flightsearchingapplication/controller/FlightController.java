package com.flightsearchingapplication.controller;

import com.flightsearchingapplication.model.FlightRequest;
import com.flightsearchingapplication.model.FlightResponse;
import com.flightsearchingapplication.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Arrays;

@Controller
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/")
    public String flights() {
        return "flights";
    }

    @PostMapping("/search")
    public String search(@RequestParam String origin, @RequestParam String destination, @RequestParam String cabin, Model model) {
        // Create request body
        FlightRequest request = new FlightRequest(
                origin,
                destination,
                Arrays.asList("Air Canada", "United Airlines", "KLM", "Qantas", "American Airlines", "Etihad Airways", "Alaska Airlines", "Qatar Airways", "LifeMiles"),
                0, // Change the stops if necessary
                "2024-07-09T00:00:00Z",
                "2024-10-07T00:00:00Z",
                false,
                302,
                0,
                Arrays.asList(cabin),
                "2024-07-09T12:00:17.796Z"
        );

        // Get mock response from file or real API response
        FlightResponse response = flightService.getFlightsFromFile(); // For mock data
        // FlightResponse response = flightService.searchFlights(request); // For real API call

        if (response != null && response.getData() != null && !response.getData().isEmpty()) {
            model.addAttribute("flights", response.getData());
        } else {
            model.addAttribute("message", "Try another search route.");
        }

        model.addAttribute("origin", origin);
        model.addAttribute("destination", destination);

        return "flights";
    }

}
