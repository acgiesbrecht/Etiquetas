/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chortitzer.industria.zebra.domain.fps;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Industria
 */
@Entity
@Table(name = "tbl_fps_lotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblFpsLotes.findAll", query = "SELECT t FROM TblFpsLotes t"),
    @NamedQuery(name = "TblFpsLotes.findById", query = "SELECT t FROM TblFpsLotes t WHERE t.id = :id"),
    @NamedQuery(name = "TblFpsLotes.findByIdFabrica", query = "SELECT t FROM TblFpsLotes t WHERE t.idFabrica = :idFabrica"),
    @NamedQuery(name = "TblFpsLotes.findByFecha", query = "SELECT t FROM TblFpsLotes t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "TblFpsLotes.findByObs", query = "SELECT t FROM TblFpsLotes t WHERE t.obs = :obs")})
public class TblFpsLotes implements Serializable {
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
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "obs")
    private String obs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLote")
    private Collection<TblFpsTambores> tblFpsTamboresCollection;

    public TblFpsLotes() {
    }

    public TblFpsLotes(Integer id) {
        this.id = id;
    }

    public TblFpsLotes(Integer id, int idFabrica, Date fecha) {
        this.id = id;
        this.idFabrica = idFabrica;
        this.fecha = fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldObs = this.obs;
        this.obs = obs;
        changeSupport.firePropertyChange("obs", oldObs, obs);
    }

    @XmlTransient
    public Collection<TblFpsTambores> getTblFpsTamboresCollection() {
        return tblFpsTamboresCollection;
    }

    public void setTblFpsTamboresCollection(Collection<TblFpsTambores> tblFpsTamboresCollection) {
        this.tblFpsTamboresCollection = tblFpsTamboresCollection;
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
        if (!(object instanceof TblFpsLotes)) {
            return false;
        }
        TblFpsLotes other = (TblFpsLotes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chortitzer.industria.zebra.domain.fps.TblFpsLotes[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
