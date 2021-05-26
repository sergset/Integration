import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Integration extends Methods {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\Integration\\test3.txt");
        Scanner sc = new Scanner(file);
        sc.useLocale(Locale.US);

        int n = 11;
        int tmp = 0;
        int tmp2 = 0;
        double x[] = new double[n];
        double y[] = new double[n];

        while (sc.hasNextDouble()) {
            if (n > tmp) {
                x[tmp] = sc.nextDouble();
                tmp++;
            } else
                break;
        }
        while (sc.hasNextDouble()) {
            if (n > tmp2) {
                y[tmp2] = sc.nextDouble();
                tmp2++;
            }
        }
        sc.close();

        Scanner scan = new Scanner(System.in);
        System.out.println(" 1. Prostokątów z niedomiarem\n 2. Prostokątów z nadmiarem\n 3. Trapezów\n 4. Simpsona");
        System.out.println("Podaj metodę całkowania (1-4): ");
        int integrationMethod = scan.nextInt();

        Integration integration = new Integration();

        switch (integrationMethod) {
            case 1:
                System.out.println(integration.rectangle(x, y));
                break;
            case 2:
                System.out.println(integration.rectangle2(x, y));
                break;
            case 3:
                System.out.println(integration.trapeze(x, y));
                break;
            case 4:
                System.out.println(integration.simpson(x, y));
                break;
            default:
                System.out.println("Nie ma takiej metody na liście!");
        }
    }
}