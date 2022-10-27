package com.bridgeLabz;


import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    public static InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25,fare, 0.8);
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnMinFare() {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5,fare, 0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride object1 =new Ride(2.0,5);
        Ride object2=new Ride(0.1,1);
        Ride[] rides={object1,object2};
        double totalFare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30,totalFare,   0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary1() {
        Ride object1 =new Ride(2.0,5);
        Ride object2=new Ride(0.1,1);
        Ride[] rides={object1,object2};
        double totalFare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30,totalFare,   0.0);
    }

}