import java.util.*;

class ReverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr Array size :");
        int size =sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Array element are. :");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

            System.out.println("Reverse is :");
            for(int i =size-1;i>=0;i--){
                System.out.println(arr[i]);
            }
        
    }
}