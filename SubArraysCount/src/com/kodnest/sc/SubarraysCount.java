package com.kodnest.sc;

import java.util.Scanner;

public class SubarraysCount {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] squares = new int[n];
        for(int i=0; i<squares.length; i++){
            squares[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        int result = countSubarrays(squares, d, m);
        System.out.println(result);
    }

	public static int countSubarrays(int[] squares, int totalSweetness, int subarraySize) {
		int count = 0;
        for(int i=0; i<=squares.length-subarraySize; i++){
        	int sum = 0;
        	 for(int j=i; j<i+subarraySize; j++){
        		 sum = sum +  squares[j];
            }
        	 if((sum == totalSweetness)){
        		 count++;
        	 }
        }
        return count;
	}
}