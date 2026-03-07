package petprogj;
import java.util.Scanner;

public class jacobi_method {
    Scanner sc = new Scanner(System.in);
    private int ans;
    private double[][] a;
    private int matricai_qanak;
    private int x, y, u;
    private double eps = 1e-6;
    private int priblijenyaneriqanaky;
    private boolean showSteps;

    public void setMatrix(double[][] matrix) {
        this.a = matrix;
        this.matricai_qanak = matrix.length;
    }
    public void askforsteps() {
        while (true) {
            System.out.print("Cuyc tal cjgryutyun@ ? greq 1 ete yes | 2 ete no/false: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please input 1 or 2");
                sc.next();
                continue;
            }
            ans = sc.nextInt();
            if (ans == 1 || ans == 2) {
                if (ans == 1) {
                    showSteps = true;
                } else {
                    showSteps = false;
                }
                break;
            } else {
                System.out.println("Input must be 1 or 2");
            }
        }
    }
    public double[] getvalues() {
        System.out.println("greq xndrumem motecman csgrtutyan motavor qnaky sovorabar 4-7");
        priblijenyaneriqanaky= sc.nextInt();
        double[] x1 = new double[matricai_qanak];
        double[] x2 = new double[matricai_qanak];
        for (x = 0; x < matricai_qanak; x++) {
            x1[x] = 0;
        }
        for (u = 0; u < priblijenyaneriqanaky; u++) {
            for (x = 0; x < matricai_qanak; x++) {
                double gummarum = a[x][matricai_qanak];
                for (y = 0; y < matricai_qanak; y++) {
                    if (y != x) {
                        gummarum -= a[x][y] * x1[y];
                    }
                }
                if (a[x][x] == 0) {
                    System.out.println(" you have a zero on the main diagonal");;
                }
                x2[x] = gummarum / a[x][x];
            }
            if (showSteps) {
                System.out.print("Iteration " + (u + 1) + ": ");
                for (int i = 0; i < x2.length; i++) {
                    System.out.print("x" + (i + 1) + "=" + x2[i] + "  ");
                }
                System.out.println();
            }
            if (stugum(x1, x2)) {
                break;
            }
            for (x = 0; x < matricai_qanak; x++) {
                x1[x] = x2[x];
            }
        }
        return x2;
    }
    private boolean stugum(double[] x1, double[] x2) {
        for (x = 0; x < matricai_qanak; x++) {
            if (Math.abs(x2[x] - x1[x]) > eps) {
                return false;
            }
        }
        return true;
    }

    public void etveradardzum(double[] x1) {
        for (x = 0; x < x1.length; x++) {
            System.out.println("x" + (x + 1) + " = " + x1[x]);
        }
        System.out.println();
    }
}
