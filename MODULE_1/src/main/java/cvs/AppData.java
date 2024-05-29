package cvs;

import java.io.*;
import java.util.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}

public class CSVFile {
    private static final String DELIMITER = ";";

    // Функция для сохранения данных в CSV-файл
    public static void saveToCSV(AppData data, String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            writer.println(String.join(DELIMITER, data.getHeader()));
            for (int[] row : data.getData()) {
                writer.println(Arrays.toString(row).replaceAll("[\\[\\]]", "").replace(", ", DELIMITER));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Функция для загрузки данных из CSV-файла
    public static AppData loadFromCSV(String filename) {
        List<int[]> data = new ArrayList<>();
        String[] header = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            header = reader.readLine().split(DELIMITER);
            while ((line = reader.readLine()) != null) {
                int[] row = Arrays.stream(line.split(DELIMITER)).mapToInt(Integer::parseInt).toArray();
                data.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[][] dataArray = data.toArray(new int[0][]);
        return new AppData(header, dataArray);
    }
}

