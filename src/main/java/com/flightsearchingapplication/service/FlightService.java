package com.flightsearchingapplication.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flightsearchingapplication.model.FlightRequest;
import com.flightsearchingapplication.model.FlightResponse;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class FlightService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "https://cardgpt.in/apitest";

    public FlightResponse searchFlights(FlightRequest request) {
        return restTemplate.postForObject(apiUrl, request, FlightResponse.class);
    }

    public FlightResponse getFlightsFromFile() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ClassPathResource resource = new ClassPathResource("response.json");
            return objectMapper.readValue(resource.getFile(), FlightResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
