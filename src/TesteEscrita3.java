import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada de arquivo

        /* OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer isr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(isr); */

        //PrintStream ps = new PrintStream(new File("lorem2.txt"));
        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();

        ps.close();

    }
}
