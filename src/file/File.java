package file;

import java.io.PrintStream;

public class File {
    public static void main(String[] args) {
        String text = "Hello. Java!";

        try {
            PrintStream prSt = new PrintStream("/home/voaldr/Java/src/file/test.txt");
            prSt.print(text + "\n");
            prSt.println("qwerty");
            prSt.println("END.");
        } catch (Exception ex) {
            System.out.println("Some ERROR");
            System.out.println(ex.getMessage());
        }
    }

}
