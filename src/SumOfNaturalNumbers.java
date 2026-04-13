import java.util.Scanner;

public class SumOfNaturalNumbers {

    static int NumberSum(int N) {
        return N * (N + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(NumberSum(N));
    }
}
