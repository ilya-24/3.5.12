import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите адрес электронной почты: ");
        String email = scan.nextLine();
        String[] domain = email.split("@");
        System.out.println("Ваш домен: " +  domain[1]);
    }
}
