package com.fresh.registerticket.ticket;
import java.io.Serializable;
import java.util.Random;

public class Ticket implements Serializable {
    private final int userID;
    private String departurePlace;
    private String departureTime;
    private String arrivalPlace;
    private String arrivalTime;
    private final int cost;

    public Ticket() {
        Random random = new Random();

        this.userID = random.nextInt(1000);
        this.cost = 150;
    }

    public Ticket(String departurePlace, String departureTime, String arrivalPlace, String arrivalTime) {
        this();

        this.departurePlace = departurePlace;
        this.departureTime = departureTime;
        this.arrivalPlace = arrivalPlace;
        this.arrivalTime = arrivalTime;
    }

    public int getUserID() {
        return userID;
    }

    public int getCost() {
        return cost;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
