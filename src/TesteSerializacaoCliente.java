import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        /* Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setProfissao("dev");
        cliente.setCpf("1254566878-50"); */

    

        /* ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close(); */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCpf());
    }
}
