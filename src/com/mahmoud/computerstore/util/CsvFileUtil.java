package com.mahmoud.computerstore.util;


import java.io.*;
import java.util.*;

public class CsvFileUtil {
    public static List<String> readLines(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<String> lines = new ArrayList<>();
            String l;
            while ((l = br.readLine()) != null) lines.add(l);
            return lines;
        }
    }

    public static void writeLines(String path, List<String> lines) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
        }
    }

    public static void appendLine(String path, String line) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(line);
            bw.newLine();
        }
    }
}
