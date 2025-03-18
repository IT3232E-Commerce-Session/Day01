// 5)Reverse the left and right numbers like
// You must use only a loop
// input  9
// output 4 3 2 1 5 9 8 7 6

// input 13
// output 6 5 4 3 2 1 7 13 12 11 10 9 8

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int mid = num / 2 + 1;
        
        int i = 1; 
        do {
            if (i <= mid - 1) {
                System.out.print((mid - 1 - i + 1) + " ");
            } 
            else if (i == mid) {
                System.out.print(mid + " ");
            } 
            else {
                System.out.print((num - (i - mid-1)) + " ");
            }
            i++; 
        } while (i <= num); 
        sc.close();
    }
}

// output
// @T-Lanojika ➜ /workspaces/Day01 (main) $ javac Q05.java
// @T-Lanojika ➜ /workspaces/Day01 (main) $ java Q05
// Enter a number: 13
// 6 5 4 3 2 1 7 13 12 11 10 9 8