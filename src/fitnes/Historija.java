/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author wedad
 */
@Entity
@Table(name = "Historija", catalog = "fitnesscentar"
)
public class Historija implements java.io.Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

   
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idhistorija", unique = true, nullable = false)
    private Integer idhistorija;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "surname", length = 45)
    private String surname;
    @Column(name = "duplate", length = 45)
    private String duplate;
    @Column(name = "disteka", length = 45)
    private String disteka;

    public Historija() {
    }

    public Historija(String name, String surname, String duplate, String disteka) {
        this.name = name;
        this.surname = surname;
        this.duplate = duplate;
        this.disteka = disteka;

    }

    public Integer getIdhistorija() {
        return this.idhistorija;
    }

    public void setId(Integer idhistorija) {
        Integer oldIdhistorija = this.idhistorija;

        this.idhistorija = idhistorija;
        changeSupport.firePropertyChange("id", oldIdhistorija, idhistorija);

    }

    public String getIme() {
        return this.name;
    }

    public void setName(String name) {
        String oldName = this.name;

        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);

    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;

        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);

    }

    public String getDuplate() {
        return this.duplate;
    }

    public void setDuplate(String duplate) {
        String oldDuplate = this.duplate;

        this.duplate = duplate;
        changeSupport.firePropertyChange("duplate", oldDuplate, duplate);

    }

    public String getDisteka() {
        return this.disteka;
    }

    public void setDisteka(String disteka) {
        String oldDisteka = this.disteka;

        this.disteka = disteka;
        changeSupport.firePropertyChange("disteka", oldDisteka, disteka);

    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
