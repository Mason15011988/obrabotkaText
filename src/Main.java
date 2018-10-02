import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("text.txt");FileWriter writer = new FileWriter("out.txt")) {
            int c;
            String line = new String();
            while((c = reader.read())!= -1){
                if ((char)c == '\r'||(char)c == '\n'){
                    line += " ";
                }else {
                    if ((char) c == '.' || (char) c == '!' || (char) c == '?') {
                        line = line.trim();
                        int t = TextFormater.count(line);
                        if ((t > 2 && t < 6)) {
                            write(writer, (char) c, line);
                        } else {
                            if (TextFormater.polindrom(line)) {
                                write(writer, (char) c, line);
                            }
                        }

                        line = new String();
                    } else {
                        line += (char) c;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(FileWriter writer, char c, String line) throws IOException {
        line += c;
        writer.write(line);
        writer.append('\n');
    }
}
