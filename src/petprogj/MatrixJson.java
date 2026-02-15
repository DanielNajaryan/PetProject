package petprogj;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import com.google.gson.Gson;
public class MatrixJson {
    List<Matrix> matricaner;

    public static class Matrix {
        int size;
        double[][] matrix;
    }
    public static List<double[][]> readFromJson(String path) {
        try (FileReader reader = new FileReader(path)) {
            Gson gson = new Gson();
            MatrixJson data = gson.fromJson(reader, MatrixJson.class);
            List<double[][]> result = new ArrayList<>();
            for (Matrix m : data.matricaner) {
                result.add(m.matrix);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException("JSON read error");
        }
    }
}
