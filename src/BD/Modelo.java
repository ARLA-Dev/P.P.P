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
    
    //Tabla Cliente
    
    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getTelefono_cli() {
        return telefono_cli;
    }

    public void setTelefono_cli(String telefono_cli) {
        this.telefono_cli = telefono_cli;
    }

    public String getDireccion_cli() {
        return direccion_cli;
    }

    public void setDireccion_cli(String direccion_cli) {
        this.direccion_cli = direccion_cli;
    }

    public String getCi_cli() {
        return ci_cli;
    }
    
    public void setCi_cli(String ci_cli) {
        this.ci_cli = ci_cli;
    }
    
    String nombre_cli, telefono_cli, direccion_cli, ci_cli;
    
    //Tabla Producto
    
    String nombre_pro, uni_med;
    double transporte_pro, mano_obra_pro, mano_obra_v;
    int cantidad_pro, cantida_mayor, id; 

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public String getUni_med() {
        return uni_med;
    }

    public void setUni_med(String uni_med) {
        this.uni_med = uni_med;
    }

    public double getTransporte_pro() {
        return transporte_pro;
    }

    public void setTransporte_pro(double transporte_pro) {
        this.transporte_pro = transporte_pro;
    }

    public double getMano_obra_pro() {
        return mano_obra_pro;
    }

    public void setMano_obra_pro(double mano_obra_pro) {
        this.mano_obra_pro = mano_obra_pro;
    }

    public double getMano_obra_v() {
        return mano_obra_v;
    }

    public void setMano_obra_v(double mano_obra_v) {
        this.mano_obra_v = mano_obra_v;
    }

    public int getCantidad_pro() {
        return cantidad_pro;
    }

    public void setCantidad_pro(int cantidad_pro) {
        this.cantidad_pro = cantidad_pro;
    }

    public int getCantida_mayor() {
        return cantida_mayor;
    }

    public void setCantida_mayor(int cantida_mayor) {
        this.cantida_mayor = cantida_mayor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //Tabla Ingredientes
    
    int id_ing, id_mp_ing, id_pro_ing;
    double cant_ing;

    public double getCant_ing() {
        return cant_ing;
    }

    public void setCant_ing(double cant_ing) {
        this.cant_ing = cant_ing;
    }
    
    public int getId_mp_ing() {
        return id_mp_ing;
    }

    public void setId_mp_ing(int id_mp_ing) {
        this.id_mp_ing = id_mp_ing;
    }

    public int getId_pro_ing() {
        return id_pro_ing;
    }

    public void setId_pro_ing(int id_pro_ing) {
        this.id_pro_ing = id_pro_ing;
    }

    public int getId_ing() {
        return id_ing;
    }

    public void setId_ing(int id_ing) {
        this.id_ing = id_ing;
    }
    
    //Listados
    
    double precio_detal;

    public double getPrecio_detal() {
        return precio_detal;
    }

    public void setPrecio_detal(double precio_detal) {
        this.precio_detal = precio_detal;
    }
}
