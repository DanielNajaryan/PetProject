package petprogj;

import java.util.Scanner;

public class ImpMatrix {
    private double[][] arr;
    private int x,u,y,n,l,b,e;
    int [] maxtver;
    Scanner scanner= new Scanner(System .in);
    //   x-y et matricai chapna lenght and weight
    public double[][] matrixint() {
        System.out.print("input matrix's lenght (gri matricai ergarutyuny)");
        x = scanner.nextInt();
        if (x < 1) {
            System.out.println("matrix's length never can be less or equal to 1");
        } else {
            arr = new double[x][x + 1];
            System.out.println("input your matrix(gri masivi tvery)");

            for (int i = 0; i < x; i++) {
                for (int k = 0; k < x + 1; k++) {
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
        }
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
