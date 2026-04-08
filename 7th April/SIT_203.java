import java.util.*;
class Order{
    int orderID;
    String customerType;
    double orderValue;
    int deliveryTime; // in hours
}

Order(int orderID, String customerType, double orderValue, int deliveryTime){
    this.orderID = orderID;
    this.customerType = customerType;
    this.orderValue = orderValue;
    this.deliveryTime = deliveryTime;
}

public class SIT_203{
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Regular", 500.0, 5),
            new Order(102, "Prime", 300.0, 3),
            new Order(103, "Prime", 700.0, 4),
            new Order(104, "Regular", 500.0, 2),
            new Order(105, "Prime", 700.0, 2)
        };
        mergeSort(orders,0,orders.length-1);

    }
    static void mergeSort(Order[] orders, int left, int right){
        if(left<right){
            int mid = left + (right-left)/2;
            mergeSort(orders,left,mid);
            mergeSort(orders,mid+1,right);
            merge(orders,left,mid,right);
        }
    }

    static void merge(Order[] orders, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Order[] leftArr = new Order[n1];
        Order[] rightArr = new Order[n2];

        for(int i=0;i<n1;i++){
            leftArr[i] = orders[left+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j] = orders[mid+1+j];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftArr[i].orderValue > rightArr[j].orderValue){
                orders[k++] = leftArr[i++];
            }
            else if(leftArr[i].orderValue < rightArr[j].orderValue){
                orders[k++] = rightArr[j++];
            }
            else{
                if(leftArr[i].deliveryTime < rightArr[j].deliveryTime){
                    orders[k++] = leftArr[i++];
                }
                else if(leftArr[i].deliveryTime > rightArr[j].deliveryTime){
                    orders[k++] = rightArr[j++];
                }
                else{
                    if(leftArr[i].customerType.equals("Prime") && rightArr[j].customerType.equals("Regular")){
                        orders[k++] = leftArr[i++];
                    }
                    else if(leftArr[i].customerType.equals("Regular") && rightArr[j].customerType.equals("Prime")){
                        orders[k++] = rightArr[j++];
                    }
                    else{
                        orders[k++] = leftArr[i++];
                    }
                }
            }
        }

        while(i<n1){
            orders[k++] = leftArr[i++];
        }
        while(j<n2){
            orders[k++] = rightArr[j++];
        }
    }
}