import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку и нажмите Enter: ");
        String str = scan.nextLine();
        System.out.print("Введенная Вами строка: " + str);
        scan.close();
    }
}