package com.bridgeLabz;

public class InvoiceGenerator {
    private static final double MIN_COST_PER_MIN=10;
    private static final int COST_PER_MIN =1;
    private static final double MIN_FARE=5;
    public static double calculateFare(double distance, int time){
        double totalFare=distance+MIN_COST_PER_MIN+time*COST_PER_MIN;
     /*  //if(totalFare<MIN_FARE)
         //   return MIN_FARE;
        //return totalFare;*/
        return Math.max(totalFare, MIN_FARE);

    }
    public double calculateFare(Ride[] rides){
        double totalFare=0;
        for(Ride ride:rides){
            totalFare=totalFare+this.calculateFare(ride.distance,ride.time);
        }
        return totalFare;

    }
}
