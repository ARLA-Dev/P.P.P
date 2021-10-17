package clases;

public class detal {
    
    private String nombre, precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public detal(String nombre, String precio){
        
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
}
