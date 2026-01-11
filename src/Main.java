import petprogj.ImpMatrix;
import petprogj.gaus_method;
import petprogj.jacobi_method;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to Kimixito-s calculator input 1 if you want decide your extended matrix with\n " +
                "gaus method else input 2 if you want decide your extended matrix with jacobi method");
        Scanner scanner= new Scanner(System .in);
        int i= scanner.nextInt();
        ImpMatrix imp = new ImpMatrix();
        double[][] arr = imp.matrixint();
if (i==1) {
        gaus_method solver = new gaus_method();
        solver.setMatrix(arr);
        double[] solution = solver.getvalues();
        solver.etveradardzum(solution);
}
else if (i==2) {
    jacobi_method jm = new jacobi_method();
    jm.setMatrix(arr);
    jm.askforsteps();
    double[] res = jm.getvalues();
    jm.etveradardzum(res);
}
else {
    System.out.println("dear user i said 1 or 2");
}


    }
    }
