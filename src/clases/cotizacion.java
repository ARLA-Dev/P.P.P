package clases;

public class cotizacion {
    
    private String identificacion, nombre, direccion, telefono, cantidades, descripciones, precio_u, precio_to, base, iva, total;  

    public cotizacion(String identificacion, String nombre, String direccion, String telefono, String cantidades, String descripciones, String precio_u, String precio_to, String base, String iva, String total) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidades = cantidades;
        this.descripciones = descripciones;
        this.precio_u = precio_u;
        this.precio_to = precio_to;
        this.base = base;
        this.iva = iva;
        this.total = total;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCantidades() {
        return cantidades;
    }

    public void setCantidades(String cantidades) {
        this.cantidades = cantidades;
    }

    public String getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(String descripciones) {
        this.descripciones = descripciones;
    }

    public String getPrecio_u() {
        return precio_u;
    }

    public void setPrecio_u(String precio_u) {
        this.precio_u = precio_u;
    }

    public String getPrecio_to() {
        return precio_to;
    }

    public void setPrecio_to(String precio_to) {
        this.precio_to = precio_to;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
}
