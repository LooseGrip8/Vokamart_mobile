package com.example.vokamart.Models;

public class Pesanan {

    private String orderId;
    private String orderStatus;

    public Pesanan(String orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
