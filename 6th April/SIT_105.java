import java.util.*;
public class SIT_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.println("\n Enter the elements of the Array:");
        for(int i=0;i<n;i++){
            System.out.println("Enter " + (i+1) +" Element: ");
            A[i]=sc.nextInt();

        }
        System.out.println("\n Enter total Queries:");
        int query = sc.nextInt();
        int totalSum=0;
        for(int q=1 ; q<=query ;q++ )
        {
                System.out.println("\nEnter the type of " + q + " Query:");
                int type = sc.nextInt();
                System.out.println("Enter the starting index of the " + q + "  Query:");
                int L =sc.nextInt() - 1;
                System.out.println("Enter the ending index of the " + q + "  Query:");
                int r= sc.nextInt() - 1;

                if(type==1){ //Replace the array from L to r
                    for(int i=L;i<=r;i++){
                        A[i]=((i-L+1)*A[L]);
                    }
                    
                }
                else if(type==2){ //sum of the array from L to r
                    int sum = 0;
                    for(int i =L;i<=r;i++)
                    {
                        sum = sum+A[i];
                    }
                    totalSum = totalSum + sum;


                }
        }
        System.out.println("\nTotal Sum of all type 2 queries: " + totalSum);
        sc.close();
        
    }
    
}
