import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("年齢を入力してください>>");
        Calculator calc = new Calculator();
        System.out.println(calc.ticket_system(sc.nextInt()));
    }
}
