package com.flightsearchingapplication.model;

import java.util.List;

public class FlightRequest {
    private String origin;
    private String destination;
    private List<String> partnerPrograms;
    private int stops;
    private String departureTimeFrom;
    private String departureTimeTo;
    private boolean isOldData;
    private int limit;
    private int offset;
    private List<String> cabinSelection;
    private String date;

    public FlightRequest(String origin, String destination, List<String> partnerPrograms, int stops, String departureTimeFrom, String departureTimeTo, boolean isOldData, int limit, int offset, List<String> cabinSelection, String date) {
        this.origin = origin;
        this.destination = destination;
        this.partnerPrograms = partnerPrograms;
        this.stops = stops;
        this.departureTimeFrom = departureTimeFrom;
        this.departureTimeTo = departureTimeTo;
        this.isOldData = isOldData;
        this.limit = limit;
        this.offset = offset;
        this.cabinSelection = cabinSelection;
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<String> getPartnerPrograms() {
        return partnerPrograms;
    }

    public void setPartnerPrograms(List<String> partnerPrograms) {
        this.partnerPrograms = partnerPrograms;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public String getDepartureTimeFrom() {
        return departureTimeFrom;
    }

    public void setDepartureTimeFrom(String departureTimeFrom) {
        this.departureTimeFrom = departureTimeFrom;
    }

    public String getDepartureTimeTo() {
        return departureTimeTo;
    }

    public void setDepartureTimeTo(String departureTimeTo) {
        this.departureTimeTo = departureTimeTo;
    }

    public boolean isOldData() {
        return isOldData;
    }

    public void setOldData(boolean oldData) {
        isOldData = oldData;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public List<String> getCabinSelection() {
        return cabinSelection;
    }

    public void setCabinSelection(List<String> cabinSelection) {
        this.cabinSelection = cabinSelection;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
