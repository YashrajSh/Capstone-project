//Q) Employee management system (Diamond Structure). This is the classic structure A-->B,C--->D structure. Create a real-time notification system. A= Employee , B= EmailNotification, C=SMSnotification , D = Manager. Both B and C inhherit from A
interface Employee{
    void notifyEmployee();

}

interface EmailNotification {
    default void notifyEmployee(){
       System.out.println("Notification Sent via EMAIL");
    }

}

interface SMSNotification {
    default void notifyEmployee(){
        System.out.println("Notification Sent via SMS");
    }
}

class Manager implements Employee, EmailNotification, SMSNotification{
    public void notifyEmployee(){
        EmailNotification.super.notifyEmployee();
        SMSNotification.super.notifyEmployee();
    }
}

public class SIT_103 {
    public static void main(String[] args) {
        Manager op = new Manager();
        op.notifyEmployee();
    }
    
}
