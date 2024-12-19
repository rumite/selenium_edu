package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        FileInputStream readFile;

        try {
            readFile = new FileInputStream("sampleSheet.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(readFile);
        XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sample Sheet");
        Row row;
        Cell cell;

        Iterator<Row> rowIterator = xssfSheet.iterator();
        while (rowIterator.hasNext()) {
            row = rowIterator.next();

            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                cell = cellIterator.next();

                DataFormatter formatter = new DataFormatter();
                String text = formatter.formatCellValue(cell);

                System.out.println(text);
            }
        }

    }
}
