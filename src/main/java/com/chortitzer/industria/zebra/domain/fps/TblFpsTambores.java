/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chortitzer.industria.zebra.domain.fps;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Industria
 */
@Entity
@Table(name = "tbl_fps_tambores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblFpsTambores.findAll", query = "SELECT t FROM TblFpsTambores t"),
    @NamedQuery(name = "TblFpsTambores.findById", query = "SELECT t FROM TblFpsTambores t WHERE t.id = :id"),
    @NamedQuery(name = "TblFpsTambores.findByIdFabrica", query = "SELECT t FROM TblFpsTambores t WHERE t.idFabrica = :idFabrica"),
    @NamedQuery(name = "TblFpsTambores.findByPesoBruto", query = "SELECT t FROM TblFpsTambores t WHERE t.pesoBruto = :pesoBruto"),
    @NamedQuery(name = "TblFpsTambores.findByPesoTara", query = "SELECT t FROM TblFpsTambores t WHERE t.pesoTara = :pesoTara")})
public class TblFpsTambores implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_fabrica")
    private int idFabrica;
    @Basic(optional = false)
    @Column(name = "peso_bruto")
    private double pesoBruto;
    @Basic(optional = false)
    @Column(name = "peso_tara")
    private double pesoTara;
    @JoinColumn(name = "id_lote", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TblFpsLotes idLote;

    public TblFpsTambores() {
    }

    public TblFpsTambores(Integer id) {
        this.id = id;
    }

    public TblFpsTambores(Integer id, int idFabrica, double pesoBruto, double pesoTara) {
        this.id = id;
        this.idFabrica = idFabrica;
        this.pesoBruto = pesoBruto;
        this.pesoTara = pesoTara;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        int oldIdFabrica = this.idFabrica;
        this.idFabrica = idFabrica;
        changeSupport.firePropertyChange("idFabrica", oldIdFabrica, idFabrica);
    }

    public double getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(double pesoBruto) {
        double oldPesoBruto = this.pesoBruto;
        this.pesoBruto = pesoBruto;
        changeSupport.firePropertyChange("pesoBruto", oldPesoBruto, pesoBruto);
    }

    public double getPesoTara() {
        return pesoTara;
    }

    public void setPesoTara(double pesoTara) {
        double oldPesoTara = this.pesoTara;
        this.pesoTara = pesoTara;
        changeSupport.firePropertyChange("pesoTara", oldPesoTara, pesoTara);
    }

    public TblFpsLotes getIdLote() {
        return idLote;
    }

    public void setIdLote(TblFpsLotes idLote) {
        TblFpsLotes oldIdLote = this.idLote;
        this.idLote = idLote;
        changeSupport.firePropertyChange("idLote", oldIdLote, idLote);
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
        if (!(object instanceof TblFpsTambores)) {
            return false;
        }
        TblFpsTambores other = (TblFpsTambores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chortitzer.industria.zebra.domain.fps.TblFpsTambores[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
