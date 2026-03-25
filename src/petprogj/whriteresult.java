/*
տեքստային ֆայլի մեջ պահպանելու կլասը
 */
package petprogj;
import java.io.FileWriter;
import java.io.IOException;
public class whriteresult {
    public static void writeResultToFile(double[] result) {
        try (FileWriter writer = new FileWriter("result.txt ")) {
            for (int i = 0; i < result.length; i++) {
                writer.write("x" + (i + 1) + " = " + result[i] + "\n");
            }
        } catch (IOException e) {
            System.out.println("honey there something wrong please check the files");
        }
    }
}

