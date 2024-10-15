package com.nexign.helloJava.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class DateExtractor {
    public static void main(String[] args) {

        String basePath = "src/main/resources/files/";
        Pattern datePattern = Pattern.compile("\\b(\\d{2}\\.\\d{2}\\.\\d{4})\\b");

        try (Stream<Path> paths = Files.walk(Paths.get(basePath))) {
            paths.filter(path -> Files.isRegularFile(path))
                    .forEach(file -> extractDatesFromFile(file, datePattern));
        } catch (IOException e) {
            System.err.println("Ошибка при обходе файлов: " + e.getMessage());
        }
    }

    private static void extractDatesFromFile(Path file, Pattern datePattern) {
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = datePattern.matcher(line);
                while (matcher.find()) {
                    System.out.println("Найдена дата: " + matcher.group(1));
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + file.getFileName() + " - " + e.getMessage());
        }
    }
}