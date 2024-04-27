import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Pavel\\IdeaProjects\\TegsDOp\\INPUT.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Pavel\\IdeaProjects\\TegsDOp\\OUTPUT.txt"))) {

            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    sb.append(line);
                    sb.append("\n");
                }
            }
            String content = sb.toString();

            Pattern emptyTagPattern = Pattern.compile("<(([a-zA-Z]+).*)>\\s*</\\1>");
            Matcher matcher = emptyTagPattern.matcher(content);
            String cleanedContent = matcher.replaceAll("");

            writer.write(cleanedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
