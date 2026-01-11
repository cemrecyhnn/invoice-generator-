package com.example.invoice.model;

import java.util.List;

public class MockInvoice {
    public String id;
    public String invoiceNumber;
    public String customerName;
    public String customerEmail;
    public BillingAddress billingAddress;
    public List<MockItem> items;
    public double subtotal;
    public double tax;
    public double total;
    public boolean paid;

    public static class BillingAddress {
        public String street, city, state, zip;
    }
    public static class MockItem {
        public String id;
        public String name;
        public int quantity;
        public double price;
    }
}
