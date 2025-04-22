package org.example;

import java.util.Date;

public class ShipmentLog {
    private ShipmentStatus status;
    private Date creationDate;

    public ShipmentLog(ShipmentStatus status) {
        this.status = status;
        this.creationDate = new Date();
    }

    public ShipmentStatus getStatus() {
        return status;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
