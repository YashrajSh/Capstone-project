//jack likes sunday..he likes to play all day , everytime month starts he counts no of sundays..consdiering day of month can be start with any of day..count no of sundays jack will get within a no of days 

public class SIT_106 {
    

    public static int countSundays(int startDay, int numberOfDays) {
        int sundays = 0;
        
        
        for (int day = 1; day <= numberOfDays; day++) {
          
            int currentDay = (startDay + day - 1) % 7;
            
           
            if (currentDay == 0) {
                sundays++;
            }
        }
        
        return sundays;
    }
    
   
    public static int countSundaysOptimized(int startDay, int numberOfDays) {
        
        int firstSundayPosition = (startDay == 0) ? 0 : (7 - startDay);
        
        
        if (firstSundayPosition >= numberOfDays) {
            return 0;
        }
        
       
        return 1 + (numberOfDays - firstSundayPosition - 1) / 7;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Test Cases:");
        System.out.println("-------------------");
        
        
        System.out.println("Month starts on Sunday (0), 30 days: " + 
                           countSundays(0, 30) + " Sundays");
        
        
        System.out.println("Month starts on Monday (1), 30 days: " + 
                           countSundays(1, 30) + " Sundays");
        
        
        System.out.println("Month starts on Saturday (6), 31 days: " + 
                           countSundays(6, 31) + " Sundays");
        
        
        System.out.println("Month starts on Wednesday (3), 28 days: " + 
                           countSundays(3, 28) + " Sundays");
        
        System.out.println("\nOptimized Method Results:");
        System.out.println("-------------------");
        
        
        System.out.println("Month starts on Sunday (0), 30 days: " + 
                           countSundaysOptimized(0, 30) + " Sundays");
        System.out.println("Month starts on Monday (1), 30 days: " + 
                           countSundaysOptimized(1, 30) + " Sundays");
        System.out.println("Month starts on Saturday (6), 31 days: " + 
                           countSundaysOptimized(6, 31) + " Sundays");
        System.out.println("Month starts on Wednesday (3), 28 days: " + 
                           countSundaysOptimized(3, 28) + " Sundays");
    }
}
