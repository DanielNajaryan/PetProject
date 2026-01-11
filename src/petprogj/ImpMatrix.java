package petprogj;

import java.util.Scanner;

public class ImpMatrix {
    private double[][] arr;
    private int x,u,y,n,l,b,e;
    int [] maxtver;
    Scanner scanner= new Scanner(System .in);
    //   x-y et matricai chapna lenght and weight
    public double[][] matrixint() {
        System.out.print("gri matricai ergarutyuny");
        x = scanner.nextInt();
         arr = new double[x][x + 1];
        System.out.println("gri masivi tvery");

        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x + 1; k++) {
                arr[i][k] = scanner.nextInt();
            }
        }
        System.out.println("matrix");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x + 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("");
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
