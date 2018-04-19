/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scout39jpa;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;


/**
 *
 * @author Fernandez
 */

@Entity
public class Progresion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId 
    private ProgresionUsuarioEventosDebil idProgresion;
    
    @Column(nullable = true, precision = 3)
    private int integracion;
    @Column(nullable = true, precision = 3)
    private int participacion;
    @Column(nullable = true, precision = 3)
    private int animacion;
    @Column(length = 500)
    private String promesa;
    @MapsId("idUsuario")
    @JoinColumn(name = "idUsuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario usuarioP;
    @MapsId("idEventos")
    @JoinColumn(name = "idEventos", referencedColumnName = "id")
    @ManyToOne
    private Eventos eventoP;


    public ProgresionUsuarioEventosDebil getIdProgresion() {
        return idProgresion;
    }

    public void setIdProgresion(ProgresionUsuarioEventosDebil idProgresion) {
        this.idProgresion = idProgresion;
    }

    public int getIntegracion() {
        return integracion;
    }

    public void setIntegracion(int integracion) {
        this.integracion = integracion;
    }

    public int getParticipacion() {
        return participacion;
    }

    public void setParticipacion(int participacion) {
        this.participacion = participacion;
    }

    public int getAnimacion() {
        return animacion;
    }

    public void setAnimacion(int animacion) {
        this.animacion = animacion;
    }

    public String getPromesa() {
        return promesa;
    }

    public void setPromesa(String promesa) {
        this.promesa = promesa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.idProgresion);
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
        final Progresion other = (Progresion) obj;
        if (!Objects.equals(this.idProgresion, other.idProgresion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Progresion{" + "idProgresion=" + idProgresion + '}';
    }
    
    
    
    
    
}
