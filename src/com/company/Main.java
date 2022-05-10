package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.printf("%5d",i*j);
            }
            System.out.println();
        }

        for (int k=1;k<=10;k++){
            for (int l=1;l<=k;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
