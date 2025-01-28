import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(" ".repeat(n-i)+"*".repeat(i+(i-1))+" ".repeat(n-i));
        }
        for(int i=n-1; i>=1; i--){
            System.out.println(" ".repeat(n-i)+"*".repeat(i+(i-1))+" ".repeat(n-i));
        }
    }
}