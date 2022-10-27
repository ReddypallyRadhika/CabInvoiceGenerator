package com.bridgeLabz;

import java.util.HashMap;

public class RideRepository {
    private static final Integer USER_ID = 1;
    public HashMap<Integer,Ride[]> RIDE_REPOSITORY=null;
    public int User_ID=1;

    public RideRepository(int user_ID) {
        User_ID = user_ID;
    }
    public double calculateFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        Ride[] listOfRides=this.RIDE_REPOSITORY.get(USER_ID);
        double totalFare=0;
        for(Ride ride:listOfRides){
            totalFare +=InvoiceGenerator.calculateFare(ride.distance,ride.time);
        }
        return totalFare;

    }
}
