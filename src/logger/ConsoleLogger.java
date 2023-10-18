package logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger {
    private static ConsoleLogger logger;
    private String fileName = "logs.txt";
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    private ConsoleLogger() {
        try {
            fileWriter = new FileWriter(fileName, false);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConsoleLogger getLogger() {
        if (logger == null) {
            logger = new ConsoleLogger();
        }
        return logger;
    }

    public void log(String message) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String messageToLog = LocalDateTime.now().format(formatter) + " | " + message;
            System.out.println(messageToLog);
            bufferedWriter.write(messageToLog);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void close() {
//        try {
//            if (bufferedWriter != null) {
//                bufferedWriter.close();
//            }
//            if (fileWriter != null) {
//                fileWriter.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
