package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DiskFile> diskFiles = new ArrayList<>();
        List<DiskFile> diskFilescopy = new ArrayList<>();

        TextFile textFile = new TextFile();
        textFile.permission = Permissions.TXT;
        textFile.type = Types.text_file;
        textFile.nameFile = "New Text File";
        textFile.text = "Hello! Welcome to our text editor!";
        diskFiles.add(textFile);
        TextFile textFile2 = (TextFile) textFile.clone();
        diskFiles.add(textFile2);

        ExcelTable excelTable = new ExcelTable();
        excelTable.permission = Permissions.XLSX;
        excelTable.type = Types.data_base;
        excelTable.nameFile = "New Excel Table";
        excelTable.columns = 3;
        excelTable.lines = 3;
        excelTable.text = "Hello! Welcome to our table editor!";
        diskFiles.add(excelTable);

        cloneAndCompare(diskFiles, diskFilescopy);
    }

    private static void cloneAndCompare(List<DiskFile> diskFiles, List<DiskFile> diskFilescopy) {
        for (DiskFile diskFile : diskFiles) {
            diskFilescopy.add(diskFile.clone());
        }

        for (int i = 0; i < diskFiles.size(); i++) {
            if (diskFiles.get(i) != diskFilescopy.get(i)) {
                System.out.println(i + " :Files are different objects");
                if (diskFiles.get(i).equals(diskFilescopy.get(i))) {
                    System.out.println(i + " :And they are identical");
                } else {
                    System.out.println(i + " :But they are not identical");
                }
            } else {
                System.out.println(i + " :File objects are the same");
            }
        }
    }
}
