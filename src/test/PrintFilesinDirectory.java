package test;

import java.io.File;

public class PrintFilesinDirectory {
    public static void main(String[] args) {
        String path="C:/Users/durge/Desktop/Resume";
        File directory = new File(path);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("No files found");
            }
        }
    }
}




