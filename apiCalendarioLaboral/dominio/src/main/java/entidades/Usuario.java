package calendariolaboral.api.dominio.entidades;

public class Usuario {

    private long id;
    private String usuario;
    private String nombre;
    private String clave;
    private String roles;

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Usuario(long id, String usuario, String nombre) {
        this.id = id;
        this.usuario = usuario;
        this.nombre = nombre;
    }

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }



    
}
