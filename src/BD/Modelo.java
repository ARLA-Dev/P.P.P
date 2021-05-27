package BD;

public class Modelo {
    
    //Tabla Clave
    
    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    //Tabla Materia Prima
    
    private String nombre_mp, unidad_medida_mp;
    private double precio_mp;
    private int id_mp;

    public String getNombre_mp() {
        return nombre_mp;
    }

    public void setNombre_mp(String nombre_mp) {
        this.nombre_mp = nombre_mp;
    }

    public String getUnidad_medida_mp() {
        return unidad_medida_mp;
    }

    public void setUnidad_medida_mp(String unidad_medida_mp) {
        this.unidad_medida_mp = unidad_medida_mp;
    }

    public double getPrecio_mp() {
        return precio_mp;
    }

    public void setPrecio_mp(double precio_mp) {
        this.precio_mp = precio_mp;
    }

    public int getId_mp() {
        return id_mp;
    }

    public void setId_mp(int id_mp) {
        this.id_mp = id_mp;
    }
    
    //Tabla
}
