import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[][] arr={ {1,2,3},{4,5,6},{7,8,9} };
        int maxVal=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]>maxVal){
                    maxVal=arr[i][j];
                }

            }
        }
        System.out.println("maximum val in 2D array is :"+maxVal);




//        int[][] arr={
//                {1,2,3},{4,5,6},{7,8,9}
//        };
//
//        int mult=1;
//        for (int i=0;i< arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                mult=mult*arr[i][j];
//            }
//        }
//        System.out.println("Multiplication of all numbers from 2 D array is:"+mult);
//


//    int[][] arr={
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };
//    int sum=0;
//    for (int i=0;i< arr.length;i++){
//        for (int j=0;j<arr[i].length;j++){
//            sum=sum+arr[i][j];
//        }
//    }
//    System.out.println("Sum of all elements from 2D array is:"+sum);





        //        int arr[][]=new int[3][4];
//        Scanner sc=new Scanner(System.in);
//
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.println("Enter the valur of row "+i+" and column "+j);
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        for (int rowIndex=0;rowIndex< arr.length;rowIndex++){
//            for (int colIndex=0;colIndex<arr[rowIndex].length;colIndex++){
//                System.out.print(arr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }









        //for different col len in each row
//        int[][] arr={
//                {2,3},
//                {4,37,8,9},
//                {9,7,5}
//        };
//        int rowLen=arr.length;
//        for (int rowIndex=0;rowIndex<rowLen;rowIndex++){
//            int colLen=arr[rowIndex].length;
//            for (int colIndex=0;colIndex<colLen;colIndex++){
//                System.out.print(arr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }









        //        int[][] arr={
//                {2,3,4},
//                {4,37,8},
//                {9,7,5}
//        };
//
//        int rowLen=arr.length;
//        int colLen=arr[0].length;
//
//        for (int rowIndex=0;rowIndex<rowLen;rowIndex++){
//            for (int colIndex=0;colIndex<colLen;colIndex++){
//                System.out.print(arr[rowIndex][colIndex]+" ");
//            }
//            System.out.println();
//        }







        //        int arr[]={2,3,4,23,-3};
//        int n=arr.length;
//        int minVal=arr[0];
//        for (int i=0;i<n;i++){
//            if (arr[i]<minVal)
//                minVal=arr[i];
//        }
//        System.out.println("the min value in array is :"+minVal);



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


