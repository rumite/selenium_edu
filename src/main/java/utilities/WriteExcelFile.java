package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class WriteExcelFile {
    public static void main(String[] args) {
        // Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create Excel Sheet
        XSSFSheet xssfSheet = workbook.createSheet("Sample Sheet");

        // Creating the data
        Map<String, Object[]> dataSet = new TreeMap<>();
        dataSet.put("1", new Object[]{"ID", "Name", "Company"});
        dataSet.put("2", new Object[]{"101", "Alice", "TechCorp"});
        dataSet.put("3", new Object[]{"102", "Bob", "InnovateX"});
        dataSet.put("4", new Object[]{"103", "Charlie", "FutureSoft"});
        dataSet.put("5", new Object[]{"104", "Diana", "Skyline Inc"});
        dataSet.put("6", new Object[]{"105", "Evan", "NextGen Ltd"});

        // Iterate over the data
        Set<String> set = dataSet.keySet();
        int rownum = 0;

        for (String key : set) {
            Row row = xssfSheet.createRow(rownum++);
            Object[] data = dataSet.get(key);
            int cellNum = 0;
            for (Object value : data) {
                Cell cell = row.createCell(cellNum++);

                if (value instanceof String) {
                    cell.setCellValue((String) value);
                } else if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                }
            }
        }

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("sampleSheet.xlsx");
            workbook.write(fileOutputStream);
            fileOutputStream.close();
            System.out.println("Created successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
