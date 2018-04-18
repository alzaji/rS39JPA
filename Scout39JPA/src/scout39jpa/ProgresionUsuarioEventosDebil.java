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
 * @author Fernandez
 */

@Embeddable
public class ProgresionUsuarioEventosDebil {
    private Usuario id;
    private Eventos idEventos;

    public Usuario getId() {
        return id;
    }

    public void setId(Usuario id) {
        this.id = id;
    }

    public Eventos getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(Eventos idEventos) {
        this.idEventos = idEventos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.idEventos);
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
        final ProgresionUsuarioEventosDebil other = (ProgresionUsuarioEventosDebil) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.idEventos, other.idEventos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProgresionUsuarioEventosDebil{" + "idUusario=" + id + ", idEventos=" + idEventos + '}';
    }

    
   
    
    
}
