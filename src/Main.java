import petprogj.ImpMatrix;
import petprogj.gaus_method;
import petprogj.jacobi_method;
import petprogj.whriteresult;
import java.util.Scanner;
import java.util.List;
import petprogj.MatrixJson;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImpMatrix imp = new ImpMatrix();
        System.out.println("welcome to Kimixito-s calculator\n" +
                "Choose input method:\n" +
                "1 - Input matrix manually\n" +
                "2 - Load matrices from JSON file");
        int inputType = scanner.nextInt();
        if (inputType == 1) {
            double[][] arr = imp.matrixint();
            solveMatrix(arr, scanner);
        } else if (inputType == 2) {
            scanner.nextLine();
            System.out.print("Enter JSON file path: ");
            String path = scanner.nextLine();
            List<double[][]> matrices = MatrixJson.readFromJson(path);
            for (double[][] arr : matrices) {
                System.out.println("Solving next matrix:");
                solveMatrix(arr, scanner);
            }
        } else {
            System.out.println("Wrong choice");
            return;
        }
    }
    public static void solveMatrix(double[][] arr, Scanner scanner) {
        System.out.println("input 1 if you want decide your extended matrix with\n" +
                "gaus method else input 2 if you want decide your extended matrix with jacobi method");
        int i = scanner.nextInt();

        System.out.println("and say if u want it to be saved it in some file if yes input 1 if no input 2");
        int whrinfile = scanner.nextInt();

        if (i == 1) {
            gaus_method solver = new gaus_method();
            solver.setMatrix(arr);
            double[] solution = solver.getvalues();
            solver.etveradardzum(solution);
            if (whrinfile == 1) {
                whriteresult.writeResultToFile(solution);
            }
        } else if (i == 2) {
            jacobi_method jm = new jacobi_method();
            jm.setMatrix(arr);
            jm.askforsteps();
            double[] res = jm.getvalues();
            jm.etveradardzum(res);
            if (whrinfile == 1) {
                whriteresult.writeResultToFile(res);
            }
        } else {
            System.out.println("dear user i said 1 or 2");
        }
    }
}