import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        //Fluxo de entrada de arquivo

        /* OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer isr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(isr); */

        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("dashudsauda dhasudashduasdhu dashudsahuhdasu");

        bw.close();

    }
}
