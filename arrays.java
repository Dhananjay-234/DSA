import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int arr[]={2,3,4,23,-3};
        int n=arr.length;
        int minVal=arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]<minVal)
                minVal=arr[i];
        }
        System.out.println("the min value in array is :"+minVal);



        //    int arr[]={2,3,4,23,-3};
//    int n=arr.length;
//    int maxVal=arr[0];
//    for (int i=0;i<n;i++){
//        if (arr[i]>maxVal)
//            maxVal=arr[i];
//    }
//    System.out.println("the maximum value in array is:"+maxVal);



//    int arr[]={10,20,30,40,12};
//    int n=arr.length;
//    int pro=1;
//    for (int i=0;i<n;i++){
//        pro=pro*arr[i];
//    }
//    System.out.println("product of elements of the array is:"+pro);


//    int arr[]={10,20,30,40,50};
//    int n=arr.length;
//    int sum=0;
//
//    for (int i=0;i<n;i++){
//        sum=sum+arr[i];
//    };
//    System.out.println("Sum of the arr is:"+sum);


//        int arr[] = {1, 2, 3, 4, 23};
//        int n = arr.length;
//
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println(arr[i]);
//        }


        //        int arr[]=new int[5];
//        int n=arr.length;
//        Scanner sc=new Scanner(System.in);
//
//        for (int i=0;i<n;i++){
//            System.out.println("provide inout for index "+i);
//            arr[i]=sc.nextInt();
//        }
//
//        for(int val:arr){
//            System.out.println(val);
//        }


      }
    }


