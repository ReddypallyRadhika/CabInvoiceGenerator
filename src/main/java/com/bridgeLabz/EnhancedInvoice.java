package com.bridgeLabz;

import java.util.Objects;

public class EnhancedInvoice {
     public int Number_Of_Rides;
    public double Total_Fare;
    public double Average_Fare;

    public EnhancedInvoice(int number_Of_Rides, double total_Fare, double average_Fare) {
        Number_Of_Rides = number_Of_Rides;
        Total_Fare = total_Fare;
        Average_Fare = average_Fare;
    }

    public  void averageFare(){
        Average_Fare=Total_Fare/Number_Of_Rides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnhancedInvoice that = (EnhancedInvoice) o;
        return Number_Of_Rides == that.Number_Of_Rides && Double.compare(that.Total_Fare, Total_Fare) == 0 && Double.compare(that.Average_Fare, Average_Fare) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Number_Of_Rides, Total_Fare, Average_Fare);
    }
}
