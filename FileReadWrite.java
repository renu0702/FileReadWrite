package org.example;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
    public void readAndWriteFileContent() {

        try {
            FileReader fr = new FileReader("C:\\Users\\user\\Documents\\Renu\\InputFile.txt");

            // Creating a FileWriter object
            FileWriter fw = new FileWriter("C:\\Users\\user\\Documents\\Renu\\OutputFile.txt");

            // Declaring a blank string in which
            // whole content of file is to be stored
            String str = "";

            int i;
            while ((i = fr.read()) != -1) {
                // Storing every character in the string
                str += (char) i;
            }

            System.out.println("File Content before reverse::" + str);

            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            System.out.println("File Content after  reverse::" + sb.toString());
            fw.write(sb.toString());

            fr.close();
            fw.close();

            System.out.println("File reading and writing both done");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

