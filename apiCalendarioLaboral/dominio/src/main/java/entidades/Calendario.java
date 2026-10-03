package calendariolaboral.api.dominio.entidades;

import entidades.Tipo;

import java.util.Date;

public class Calendario {

    private int id;
    private Date fecha;
    private Tipo tipo;
    private String descripcion;
    private Pais pais;
    public Calendario() {
    }

    public Calendario(int id, Date fecha, Tipo tipo, String descripcion, Pais pais) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.pais = pais;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
