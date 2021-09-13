package com.basePackage.TestLayer;
import com.bethecoder.ascii_table.ASCIITable;

public class TableTest {

    public static void main(String[] args) {

        String [] tableHeaders = { "Employee Name", "Salary", "Designation","Department"};

        String[][] tableData = {
                { "Mike Kurts", "10000", "Developer", "IT"  },
                { "Steve Musk", "20000", "Lead DevOps", "IT" },
                { "Larry Jobs", "30000", "Java Developer", "IT" },
                { "Elon Peters", "400000", "Manager", "IT" },
                { "Jake Burg", "50000000", "CEO", "IT"  },
        };

        ASCIITable.getInstance().printTable(tableHeaders, tableData);
        System.out.println(ASCIITable.getInstance().getTable(tableHeaders, tableData).toString());
    }
}