import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        String s = "Ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.println(bytes.length + " windows-1252");
        String snovo = new String(bytes, "windows-1252");
        System.out.println(snovo);

        bytes = s.getBytes("UTF-16");
        System.out.println(bytes.length + " UTF-16");
        String sutf16 = new String(bytes, "UTF-16");
        System.out.println(sutf16);

        bytes = s.getBytes("UTF-8");
        System.out.println(bytes.length + " UTF-8");
        String sutf8 = new String(bytes, "UTF-8");
        System.out.println(sutf8);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + " ASCII");
        String sascii = new String(bytes, "ASCII");
        System.out.println(sascii);
    }
}
