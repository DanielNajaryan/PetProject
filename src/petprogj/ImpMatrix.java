package petprogj;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ImpMatrix {
    private double[][] arr;
    private int x,u,n,l;
    int [] maxtver;
    Scanner scanner= new Scanner(System .in);
    //   x-y et matricai chapna lenght and weight
    public double[][] matrixint() {
        while (true) {
            System.out.print("Գրեք մատրիցի երկարությունը: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number!");
                scanner.next();
                continue;
            }
            x = scanner.nextInt();
            if (x <= 1) {
                System.out.println("matrix's length never can be less than 1");
                continue;
            }
            break;
        }
        arr = new double[x][x + 1];
        System.out.println("Գրեք մատրիցի մեջ եղած թվերը, յուրաքնչյուր թվի ներմուծումից հետո սեղմեք enter");
        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x + 1; k++) {
                while (!scanner.hasNextDouble()) {
                    System.out.println("Please enter a number:");
                    scanner.next();
                }
                arr[i][k] = scanner.nextDouble();
            }
        }
        System.out.println("matrix");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }
    public void setMaxgcivra(){
        double[] maxgcivra =new double[x];
        for (int i = 0; i < x; i++) {
            double max = arr[i][0];
            for (int j = 1; j < x + 1; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            maxgcivra[i] = max;
        }
    }
}
