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
 * @author Dani
 */
@Embeddable
public class ComentariosUsuarioEventosDebil {

    private Long idComentarios;
    private Usuario idUsuario;
    private Eventos idEvento;

    public Long getIdComentarios() {
        return idComentarios;
    }

    public void setIdComentarios(Long idComentarios) {
        this.idComentarios = idComentarios;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Eventos getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Eventos idEvento) {
        this.idEvento = idEvento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.idComentarios);
        hash = 47 * hash + Objects.hashCode(this.idUsuario);
        hash = 47 * hash + Objects.hashCode(this.idEvento);
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
        final ComentariosUsuarioEventosDebil other = (ComentariosUsuarioEventosDebil) obj;
        if (!Objects.equals(this.idComentarios, other.idComentarios)) {
            return false;
        }
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        if (!Objects.equals(this.idEvento, other.idEvento)) {
            return false;
        }
        return true;
    }

}
