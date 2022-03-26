package ar.org.centro8.curso.java.clase05.entities;
//Servicio de normalización de direcciones usig buenos aires para ver direcciones normalizadas agregar al final de la url direccion = direccionESPACIOaltura
public class Direccion {
    private String calle;
    private int nro;
    private String piso;
    private String depto;
    private String ciudad;
    
    //CONSTRUCTOR PARA DIRECCIONES DE CABA

    public Direccion(String calle, int nro, String piso, String depto) {
        this.calle = calle;
        this.nro = nro;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = "CABA";
    }
    
    public Direccion(String calle, int nro, String piso, String depto, String ciudad) {
        this.calle = calle;
        this.nro = nro;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", depto=" + depto + ", nro=" + nro + ", piso="
                + piso + "]";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
    
}
