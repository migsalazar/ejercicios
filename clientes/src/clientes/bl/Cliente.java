package clientes.bl;

public class Cliente {
    
    public String nombre;
    public String apellido;
    
    public Cliente(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String obtenerNombreCompleto()
    {
        return this.nombre + " " + this.apellido;
    }
}
