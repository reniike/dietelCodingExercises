import org.junit.jupiter.api.Test;
import tdd.HekkaParcel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HekkaParcelTest {
     @Test
     public void testForCROfFiftyPercentToFiftyNinePercent() {
          HekkaParcel parcel = new HekkaParcel();
          double  bonus = parcel.bonus(50,100);
          assertEquals(10_000, bonus);
     }
     @Test
     public void testForCollectionRateOfSixtyToSixtyNinePercent(){
          HekkaParcel parcel = new HekkaParcel();
          double bonus = parcel.bonus(60,100);
          assertEquals(15_000, bonus);
     }
     @Test
     public void testForCollectionRateOfSeventyAndAbove(){
          HekkaParcel parcel = new HekkaParcel();
          double bonus = parcel.bonus(70,100);
          assertEquals(35_000,bonus);
     }
}

