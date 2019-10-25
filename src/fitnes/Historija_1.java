/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author wedad
 */
@Entity
@Table(name = "historija", catalog = "fitnesscentar", schema = "")
@NamedQueries({
    @NamedQuery(name = "Historija_1.findAll", query = "SELECT h FROM Historija_1 h"),
    @NamedQuery(name = "Historija_1.findByIdhistorija", query = "SELECT h FROM Historija_1 h WHERE h.idhistorija = :idhistorija"),
    @NamedQuery(name = "Historija_1.findByName", query = "SELECT h FROM Historija_1 h WHERE h.name = :name"),
    @NamedQuery(name = "Historija_1.findBySurname", query = "SELECT h FROM Historija_1 h WHERE h.surname = :surname"),
    @NamedQuery(name = "Historija_1.findByDuplate", query = "SELECT h FROM Historija_1 h WHERE h.duplate = :duplate"),
    @NamedQuery(name = "Historija_1.findByDisteka", query = "SELECT h FROM Historija_1 h WHERE h.disteka = :disteka")})
public class Historija_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhistorija")
    private Integer idhistorija;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "duplate")
    private String duplate;
    @Column(name = "disteka")
    private String disteka;

    public Historija_1() {
    }

    public Historija_1(Integer idhistorija) {
        this.idhistorija = idhistorija;
    }

    public Integer getIdhistorija() {
        return idhistorija;
    }

    public void setIdhistorija(Integer idhistorija) {
        Integer oldIdhistorija = this.idhistorija;
        this.idhistorija = idhistorija;
        changeSupport.firePropertyChange("idhistorija", oldIdhistorija, idhistorija);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public String getDuplate() {
        return duplate;
    }

    public void setDuplate(String duplate) {
        String oldDuplate = this.duplate;
        this.duplate = duplate;
        changeSupport.firePropertyChange("duplate", oldDuplate, duplate);
    }

    public String getDisteka() {
        return disteka;
    }

    public void setDisteka(String disteka) {
        String oldDisteka = this.disteka;
        this.disteka = disteka;
        changeSupport.firePropertyChange("disteka", oldDisteka, disteka);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhistorija != null ? idhistorija.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historija_1)) {
            return false;
        }
        Historija_1 other = (Historija_1) object;
        if ((this.idhistorija == null && other.idhistorija != null) || (this.idhistorija != null && !this.idhistorija.equals(other.idhistorija))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fitnes.Historija_1[ idhistorija=" + idhistorija + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
