package com.bridgeLabz;

public class PremiumRides {
    private static final double PREMIUM_MIN_COST_PER_MIN=15;
    private static final int PREMIUM_COST_PER_MIN =2;
    private static final double PREMIUM_MIN_FARE=20;
    public double PREMIUM_calculateFare(double distance,int time){
        double totalFare=distance+PREMIUM_MIN_COST_PER_MIN+time*PREMIUM_COST_PER_MIN;
     /*  //if(totalFare<MIN_FARE)
         //   return MIN_FARE;
        //return totalFare;*/
        return Math.max(totalFare, PREMIUM_MIN_FARE);

    }
    public double premiumCalculateFare(Ride[] rides){
        double totalFare=0;
        for(Ride ride:rides){
            totalFare=totalFare+this.PremiumCalculateFare(ride.distance,ride.time);
        }
        return totalFare;

    }

    private double PremiumCalculateFare(double distance, int time) {
        return distance;
    }


}
