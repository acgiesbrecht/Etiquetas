/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chortitzer.industria.zebra.domain.bal;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Industria
 */
@Entity
@Table(name = "tbl_etiquetadora_impresion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEtiquetadoraImpresion.findAll", query = "SELECT t FROM TblEtiquetadoraImpresion t"),
    @NamedQuery(name = "TblEtiquetadoraImpresion.findByFechahora", query = "SELECT t FROM TblEtiquetadoraImpresion t WHERE t.fechahora = :fechahora"),
    @NamedQuery(name = "TblEtiquetadoraImpresion.findByIdFormula", query = "SELECT t FROM TblEtiquetadoraImpresion t WHERE t.idFormula = :idFormula"),
    @NamedQuery(name = "TblEtiquetadoraImpresion.findByPeso", query = "SELECT t FROM TblEtiquetadoraImpresion t WHERE t.peso = :peso"),
    @NamedQuery(name = "TblEtiquetadoraImpresion.findByLote", query = "SELECT t FROM TblEtiquetadoraImpresion t WHERE t.lote = :lote"),
    @NamedQuery(name = "TblEtiquetadoraImpresion.findByCantidad", query = "SELECT t FROM TblEtiquetadoraImpresion t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "TblEtiquetadoraImpresion.findByTurno", query = "SELECT t FROM TblEtiquetadoraImpresion t WHERE t.turno = :turno"),
    @NamedQuery(name = "TblEtiquetadoraImpresion.findByLinea", query = "SELECT t FROM TblEtiquetadoraImpresion t WHERE t.linea = :linea")})
public class TblEtiquetadoraImpresion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fechahora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechahora;
    @Basic(optional = false)
    @Column(name = "Id_formula")
    private int idFormula;
    @Basic(optional = false)
    @Column(name = "peso")
    private int peso;
    @Basic(optional = false)
    @Column(name = "lote")
    private int lote;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "turno")
    private int turno;
    @Basic(optional = false)
    @Column(name = "linea")
    private int linea;

    public TblEtiquetadoraImpresion() {
    }

    public TblEtiquetadoraImpresion(Date fechahora) {
        this.fechahora = fechahora;
    }

    public TblEtiquetadoraImpresion(Date fechahora, int idFormula, int peso, int lote, int cantidad, int turno, int linea) {
        this.fechahora = fechahora;
        this.idFormula = idFormula;
        this.peso = peso;
        this.lote = lote;
        this.cantidad = cantidad;
        this.turno = turno;
        this.linea = linea;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public int getIdFormula() {
        return idFormula;
    }

    public void setIdFormula(int idFormula) {
        this.idFormula = idFormula;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fechahora != null ? fechahora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEtiquetadoraImpresion)) {
            return false;
        }
        TblEtiquetadoraImpresion other = (TblEtiquetadoraImpresion) object;
        if ((this.fechahora == null && other.fechahora != null) || (this.fechahora != null && !this.fechahora.equals(other.fechahora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chortitzer.zebra.balanceados.TblEtiquetadoraImpresion[ fechahora=" + fechahora + " ]";
    }
    
}
