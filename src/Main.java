import petprogj.ImpMatrix;
import petprogj.gaus_method;
import petprogj.jacobi_method;
import petprogj.whriteresult;
import java.util.Scanner;
import java.util.List;
import petprogj.MatrixJson;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImpMatrix imp = new ImpMatrix();
        int inputType;
        System.out.println("welcome to Kimixito-s calculator\n");
        while (true) {
            System.out.println(
                               "Choose input method:\n" +
                               "1 - Input matrix manually\n" +
                               "2 - Load matrices from JSON file");
            if (scanner.hasNextInt()) {
                inputType = scanner.nextInt();

                if (inputType == 1 || inputType == 2) {
                    break;
                } else {
                    System.out.println("Please enter only 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        double[][] matrix;
        if (inputType == 1) {
            matrix = imp.matrixint();
        } else {
            List<double[][]> matrices = MatrixJson.readFromJson("matrix.json");
            matrix = matrices.get(0);
        }
        solveMatrix(matrix, scanner);
    }
        public static void solveMatrix ( double[][] arr, Scanner scanner) {
            int i;
            System.out.println("input 1 if you want decide your extended matrix with\n" +
                    "gaus method else input 2 if you want decide your extended matrix with jacobi method");
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Please input only number 1 or 2");
                    scanner.next();
                    continue;
                }
                i = scanner.nextInt();
                if (i == 1 || i == 2) {
                    break;
                } else {
                    System.out.println("your input is wrong, input 1 or 2 as stated in instruction");
                }
            }
            System.out.println("and say if u want it to be saved it in some file if yes input 1 if no input 2");
            int whrinfile;
            while (true) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Please input 1 or 2");
                    scanner.next();
                    continue;
                }
                whrinfile = scanner.nextInt();
                if (whrinfile == 1 || whrinfile == 2) {
                    break;
                } else {
                    System.out.println("Please input only 1 or 2");
                }
            }
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
            }
        }

}