

// import java.util.*;

// public class SIT_303 {
//     public static void main(String[] args) {
//         int n = 40;
//         List<Integer> primes = sieveOfEratosthenes(n);
//         System.out.println("Prime numbers up to " + n + ": " + primes);
//     }

//     public static List<Integer> sieveOfEratosthenes(int n) {
//         boolean[] isPrime = new boolean[n + 1];
//         Arrays.fill(isPrime, true);
//         isPrime[0] = isPrime[1] = false;

//         for (int i = 2; i * i <= n; i++) {
//             if (isPrime[i]) {
//                 for (int j = i * i; j <= n; j += i) {
//                     isPrime[j] = false;
//                 }
//             }
//         }

//         List<Integer> primes = new ArrayList<>();
//         for (int i = 2; i <= n; i++) {
//             if (isPrime[i]) {
//                 primes.add(i);
//             }
//         }
//         return primes;
//     }
// }

public class SIT_303{
    public static void main(String[] args) {
       int n =40;
       boolean[] prime = new boolean[n+1];
       sieve(n,prime); 
    }
    static void sieve(int num , boolean[] prime){
        for(int i=2;i*i<=num;i++){
            if(prime[i]==false){
                for(int j=i*i;j<=num;j+=i){
                    prime[j]=true;
                }
            }
        }
        System.out.println("Prime numbers up to "+num+":");
        for(int i=2;i<=num;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}

