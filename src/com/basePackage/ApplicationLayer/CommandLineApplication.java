package com.basePackage.ApplicationLayer;

import com.basePackage.PhysicalLayer.Table;
import com.basePackage.PhysicalLayer.TableManager;
import com.basePackage.UtilityLayer.StringContainer;

import java.util.Scanner;

public class CommandLineApplication {
    public  static void main(String[] args) throws Exception {
        System.out.println("Welcome to TinyRDBMS, please enter the SQL commands: \n" +
                "       Type the command '$exit' to close the shell. \n" +
                "       Type \"SHOW TABLES\" to display all the tables. \n" +
                "       The SQL commands other than $exit will be sent when pressing enter on empty line. \n");
        Scanner scanner = new Scanner(System.in);
        int numberCommand = 1;
        while (true) {
            String command = "";
            while (true) {
                String line = scanner.nextLine();
                if (line.equals("")) {
                    break;
                } else if (line.equals("$exit")) {
                    TableManager.getInstance().shutDown();
                    System.exit(0);
                }else{
                    command += "\n" + line;
                }
            }

            StringContainer result = new StringContainer("");
            try {
                long start = System.currentTimeMillis();
                SQLiteExecutor.execCommand(command, result);
                if(!result.toString().equals("")){
                    System.out.println(result);
                }
                System.out.println("OK, completed in " + (System.currentTimeMillis() - start) + " milliseconds");
            } catch (Exception e) {
                if(!result.toString().equals("")) {
                    System.err.println("ERROR:" + result);
                }
            }
            numberCommand++;
            System.out.println("\n\nCommand number: " + numberCommand);
        }
    }
}
