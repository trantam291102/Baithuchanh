import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap số thu nhat: ");
            a = scanner.nextInt();
            System.out.println("Nhap số thu hai: ");
            b = scanner.nextInt();
        }
        int min = a;//Gán giá trị của biến a cho min
        if(a>b)
        min=b;
        System.out.println("So nho nhat trong 2 số "+a+" và "+b+"la"+min);
    }
}
