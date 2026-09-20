import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    int numOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        // code here
        LocalDate D1=LocalDate.of(y1,m1,d1);
        LocalDate D2=LocalDate.of(y2,m2,d2);
        
        return (int) Math.abs(ChronoUnit.DAYS.between(D1, D2));
    }
};