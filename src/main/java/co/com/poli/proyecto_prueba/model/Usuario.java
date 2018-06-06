package co.com.poli.proyecto_prueba.model;

import java.util.Objects;

public class Usuario
{
    private String documento;
    private String nombres;
    private String apellidos;
    private String email;
    private String clave;
    private String rol;
    private Boolean estado;

    public Usuario(String documento, String nombres, String apellidos, String email, String clave, String rol, Boolean estado) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }

    public String getRol() {
        return rol;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.documento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        return true;
    }
    
    
    
}
