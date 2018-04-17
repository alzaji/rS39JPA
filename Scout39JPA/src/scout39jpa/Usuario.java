/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scout39jpa;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author hidden-process
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public List<Cuotas> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuotas> cuotas) {
        this.cuotas = cuotas;
    }
    @Column(unique = true, nullable = false, length = 50)
    private String alias;
    @Column(nullable = false, length = 255)
    private String nombre;
    @Column(nullable = false, length = 255)
    private String apellidos;
    @Column(nullable = false, length = 255)
    private String digest;
    @Column(nullable = false, length = 128)
    private String email;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha_alta;
    @Temporal(TemporalType.DATE)
    private Date fecha_baja;
    @OneToMany(mappedBy = "usuario")
    private List<Roles> roles;
    @OneToMany(mappedBy = "usuario")
    private List<Cuotas> cuotas;
    @OneToMany(mappedBy = "usuario")
    private List<Archivo> archivo;
    @OneToMany(mappedBy="usuario")
    private List<Comentarios> comentario;
    @OneToMany(mappedBy="usuario")
    private List<Progresion> progresion;
    @OneToMany(mappedBy="usuario")
    private List<Grupo> grupo;

    public List<Archivo> getArchivo() {
        return archivo;
    }

    public void setArchivo(List<Archivo> archivo) {
        this.archivo = archivo;
    }

    public List<Comentarios> getComentario() {
        return comentario;
    }

    public void setComentario(List<Comentarios> comentario) {
        this.comentario = comentario;
    }

    public List<Progresion> getProgresion() {
        return progresion;
    }

    public void setProgresion(List<Progresion> progresion) {
        this.progresion = progresion;
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupo = grupo;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scout39jpa.Usuario[ id=" + id + " ]";
    }

}
