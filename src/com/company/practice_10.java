package com.company;
import java.util.*;
public class practice_10 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("no of rows:");

        int rows= sc.nextInt();

        System.out.println("no of col:");

        int col= sc.nextInt();

        int [][] arr=new int[rows][col];

        System.out.println("enter the element :");
        for(int i=0;i<rows;i++){
            for (int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++) {
            for (int j = col-1; j >0; j--) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }


}
