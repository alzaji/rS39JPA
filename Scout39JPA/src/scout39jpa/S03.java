/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scout39jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author pasantru
 */
@Entity
public class S03 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, length = 50)
    private String grupo;
    @Column(nullable = false, length = 30)
    private String nombre;
    @Column(nullable = false, length = 30)
    private String apellido1;
    @Column(nullable = false, length = 30)
    private String apellido2;
    @Column(nullable = false, length = 20)
    private String dni;
    @TemporalType(TemporalType.DATE)
    private Date fnacimiento;
    //1 para M y 0 para F
    private boolean sexo;
    @Column(nullable = false, length = 100)
    private String calleynumero;
    private int codPostal;
    @Column(nullable = false, length = 50)
    private String provincia;
    @Column(nullable = false, length = 50)
    private String localidad;
    private int telefono;
    private int movil;
    @Temporal(TemporalType.DATE)
    private Date fingreso;
    @Temporal(TemporalType.DATE)
    private Date fbaja;
    @Column(nullable = false, length = 30)
    private String seccion;
    @Column(nullable = false, length = 30)
    private String cargo;
    @Column(nullable = false, length = 30)
    private String ambito;
    @Column(nullable = false, length = 30)
    private String federal;
    @Column(nullable = false, length = 30)
    private String asociativo;
    @Column(nullable = false, length = 30)
    private String provincial;
    @Column(nullable = false, length = 30)
    private String grupoAmbito;
    @Column(nullable = false, length = 30)
    private String nombreResponsableLegal;
    @Column(nullable = false, length = 30)
    private String apellido1ResponsableLegal;
    @Column(nullable = false, length = 30)
    private String apellido2ResponsableLegal;
    @Column(nullable = false, length = 30)
    private String nombreResponsableLegalOtro;
    @Column(nullable = false, length = 30)
    private String apellido1ResponsableLegalOtro;
    @Column(nullable = false, length = 30)
    private String apellido2ResponsableLegalOtro;
    @OneToOne
    private Archivo archivo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getCalleynumero() {
        return calleynumero;
    }

    public void setCalleynumero(String calleynumero) {
        this.calleynumero = calleynumero;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    public Date getFingreso() {
        return fingreso;
    }

    public void setFingreso(Date fingreso) {
        this.fingreso = fingreso;
    }

    public Date getFbaja() {
        return fbaja;
    }

    public void setFbaja(Date fbaja) {
        this.fbaja = fbaja;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getFederal() {
        return federal;
    }

    public void setFederal(String federal) {
        this.federal = federal;
    }

    public String getAsociativo() {
        return asociativo;
    }

    public void setAsociativo(String asociativo) {
        this.asociativo = asociativo;
    }

    public String getProvincial() {
        return provincial;
    }

    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }

    public String getGrupoAmbito() {
        return grupoAmbito;
    }

    public void setGrupoAmbito(String grupoAmbito) {
        this.grupoAmbito = grupoAmbito;
    }

    public String getNombreResponsableLegal() {
        return nombreResponsableLegal;
    }

    public void setNombreResponsableLegal(String nombreResponsableLegal) {
        this.nombreResponsableLegal = nombreResponsableLegal;
    }

    public String getApellido1ResponsableLegal() {
        return apellido1ResponsableLegal;
    }

    public void setApellido1ResponsableLegal(String apellido1ResponsableLegal) {
        this.apellido1ResponsableLegal = apellido1ResponsableLegal;
    }

    public String getApellido2ResponsableLegal() {
        return apellido2ResponsableLegal;
    }

    public void setApellido2ResponsableLegal(String apellido2ResponsableLegal) {
        this.apellido2ResponsableLegal = apellido2ResponsableLegal;
    }

    public String getNombreResponsableLegalOtro() {
        return nombreResponsableLegalOtro;
    }

    public void setNombreResponsableLegalOtro(String nombreResponsableLegalOtro) {
        this.nombreResponsableLegalOtro = nombreResponsableLegalOtro;
    }

    public String getApellido1ResponsableLegalOtro() {
        return apellido1ResponsableLegalOtro;
    }

    public void setApellido1ResponsableLegalOtro(String apellido1ResponsableLegalOtro) {
        this.apellido1ResponsableLegalOtro = apellido1ResponsableLegalOtro;
    }

    public String getApellido2ResponsableLegalOtro() {
        return apellido2ResponsableLegalOtro;
    }

    public void setApellido2ResponsableLegalOtro(String apellido2ResponsableLegalOtro) {
        this.apellido2ResponsableLegalOtro = apellido2ResponsableLegalOtro;
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
        if (!(object instanceof S03)) {
            return false;
        }
        S03 other = (S03) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "scout39jpa.S03[ id=" + id + " ]";
    }

}
