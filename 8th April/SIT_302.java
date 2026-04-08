

public class SIT_302 {
    public static void main(String[] args) {
        int n= 40;
        for(int i = 2;i<=40;i++){
            System.out.println(i+":"+isPrime(i));



        }
    }

    public static boolean isPrime(int number){
        int c=2;
        while(c*c<=number){
            if(number%c==0){
                return false;
            }
            c++;

        }
        return true;

    }

    
}
