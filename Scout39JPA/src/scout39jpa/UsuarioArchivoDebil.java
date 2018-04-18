/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scout39jpa;

import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author aruizdlt
 */
@Embeddable
public class UsuarioArchivoDebil {
    
    private Usuario idUsuario;
    private long idArchivo;
    
    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(long idArchivo) {
        this.idArchivo = idArchivo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.idUsuario);
        hash = 73 * hash + (int) (this.idArchivo ^ (this.idArchivo >>> 32));
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
        final UsuarioArchivoDebil other = (UsuarioArchivoDebil) obj;
        if (this.idArchivo != other.idArchivo) {
            return false;
        }
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        return true;
    }
    
}
