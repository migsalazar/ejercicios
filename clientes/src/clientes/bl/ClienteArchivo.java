package clientes.bl;
import java.io.*;

public class ClienteArchivo {
    
    public static boolean GuardarCliente(Cliente cliente)
    {
        File file; 
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        
        try
        {
            file = new File("/home/mikengine/github/clientes.txt");
            
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.write(cliente.obtenerNombreCompleto());            
            pw.println();
            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
        finally { 
            
            try { 
                pw.close();
                fw.close();
                bw.close();
            }
            catch(Exception e)
            {
                return false;
            }
        }
    }
    
    
}
