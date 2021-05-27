import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Integration extends Methods {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\Integration\\test3.txt");
        Scanner sc = new Scanner(file);
        sc.useLocale(Locale.US);

        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        int temp2=0;
        int temp3=0;
        for(int i=0; i<b.length(); i++)
        {
            char xd[] = b.toCharArray();
            if (xd[i]==32)
            {
                temp3++;
            }
        }
        double[] x = new double[temp3+1];
        double[] y = new double[temp3+1];
        temp3=0;
        temp2=0;
        for(int i=0; i<b.length(); i++)
        {
            char xd[] = b.toCharArray();
            String temp;
            if (xd[i]==32)
            {
                temp=b.substring(temp2, i);
                temp2=i;
                y[temp3]=Double.parseDouble(temp);
                temp3++;
            }
        }
        System.out.println(Arrays.toString(y));
        temp2=0;
        temp3=0;
        for(int i=0; i<a.length(); i++)
        {

            char xd[] = a.toCharArray();
            String temp;
            if (xd[i]==32)
            {
                temp=a.substring(temp2, i);
                temp2=i;
                x[temp3]=Double.parseDouble(temp);
                temp3++;
            }
        }
        x[temp3]=Double.parseDouble(a.substring(temp2));
        System.out.println(Arrays.toString(x));


        /*while (sc.hasNextDouble()) {
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
        }*/

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