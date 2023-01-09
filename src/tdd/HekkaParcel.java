package tdd;

public class HekkaParcel {

    public double bonus(double totalDelivered, double totalScanned) {
        double bonus = 0;
        double collectionRate = (totalDelivered / totalScanned) * 100;
        if (collectionRate >= 50 && collectionRate <= 59) {
            bonus = totalDelivered * 200;
        }
       else
           if (collectionRate >= 60 && collectionRate <= 69 ) {
           bonus = totalDelivered * 250;
        }
       else
           if (collectionRate >= 70 ){
           bonus = totalDelivered * 500;
        }
           return bonus;
    }

}


