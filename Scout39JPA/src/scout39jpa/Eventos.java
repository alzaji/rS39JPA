/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scout39jpa;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Fernandez
 */
@Entity
public class Eventos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEventos;
    @OneToMany(mappedBy = "eventoP")
    private List<Progresion> progresionesE;

    public Long getId() {
        return idEventos;
    }

    public void setId(Long id) {
        this.idEventos = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEventos != null ? idEventos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventos)) {
            return false;
        }
        Eventos other = (Eventos) object;
        if ((this.idEventos == null && other.idEventos != null) || (this.idEventos != null && !this.idEventos.equals(other.idEventos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scout39jpa.Eventos[ id=" + idEventos + " ]";
    }
    
}
