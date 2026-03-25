package petprogj;

public class gaus_method {
    private double[][] a;
    private int matricai_qanak;
    private int y, u, x;
    /*
    մատրիցայի ներմուծումը՝ impmatrix-ում, որը վերագրում է main կլասում
     */
    public void setMatrix(double[][] matrix) {
        this.a = matrix;
        this.matricai_qanak = matrix.length;
    }
    /*
        գաուսի մեթոդով պատասխանի ստանալու համար կատարված գործողությունները և լոգիկա
         */
    private void hasvark() {
        for (int i = 0; i < matricai_qanak; i++) {
            double pivot = a[i][i];
            for (x = i; x <= matricai_qanak; x++) {
                a[i][x] /= pivot;
            }
            for (y = i + 1; y < matricai_qanak; y++) {
                double factor = a[y][i];
                for (int k = i; k <= matricai_qanak; k++) {
                    a[y][k] -= factor * a[i][k];
                }
            }
        }
    }

    public double[] getvalues() {
        hasvark();
        double[] x1 = new double[matricai_qanak];
        for (int i = matricai_qanak - 1; i >= 0; i--) {
            x1[i] = a[i][matricai_qanak];
            for (u = i + 1; u < matricai_qanak; u++) {
                x1[i] -= a[i][u] * x1[u];
            }
        }
        return x1;
    }
    /*
    պատասխանի վերադարձ
     */
    public void etveradardzum(double[] x1) {
        for (int i = 0; i < x1.length; i++) {
            System.out.println("x" + (i + 1) + " = " + x1[i]);
        }
        System.out.println();
    }
}
