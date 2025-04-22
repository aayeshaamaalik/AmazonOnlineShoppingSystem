package org.example;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private Address shippingAddress;
    private List<Item> items;
    private List<Shipment> shipments;
    private Payment payment;

    public Order(String orderNumber, Address shippingAddress, List<Item> items, Payment payment) {
        this.orderNumber = orderNumber;
        this.status = OrderStatus.Pending;
        this.orderDate = new Date();
        this.shippingAddress = shippingAddress;
        this.items = items;
        this.payment = payment;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
