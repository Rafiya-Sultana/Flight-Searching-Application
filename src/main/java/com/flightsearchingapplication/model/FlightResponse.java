package com.flightsearchingapplication.model;

import java.util.List;

public class FlightResponse {
    private List<Flight> data;

    public List<Flight> getData() {
        return data;
    }

    public void setData(List<Flight> data) {
        this.data = data;
    }
}
