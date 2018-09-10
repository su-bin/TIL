import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = 0; i < (int)b; i++) {
            for(int j = 0; j < (int)a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}