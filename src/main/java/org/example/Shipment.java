package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shipment {
    private Date shippedDate;
    private Date estimatedArrival;
    private String trackingNumber;
    private List<ShipmentLog> logs;

    public Shipment(Date shippedDate, Date estimatedArrival, String trackingNumber) {
        this.shippedDate = shippedDate;
        this.estimatedArrival = estimatedArrival;
        this.trackingNumber = trackingNumber;
        this.logs = new ArrayList<>();
    }

    public void addLog(ShipmentLog log) {
        logs.add(log);
    }

    public List<ShipmentLog> getLogs() {
        return logs;
    }
}
