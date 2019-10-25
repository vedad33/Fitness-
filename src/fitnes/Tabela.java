package fitnes;
// Generated Sep 4, 2019 12:49:47 PM by Hibernate Tools 4.3.1

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
 * Tabela generated by hbm2java
 */
@Entity
@Table(name = "tabela", catalog = "fitnesscentar"
)
public class Tabela implements java.io.Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "ime", length = 45)
    private String ime;
    @Column(name = "prezime", length = 45)
    private String prezime;
    @Column(name = "adresa", length = 45)
    private String adresa;
    @Column(name = "datumuplate", length = 45)
    private String datumuplate;
    @Column(name = "clanarinaistekla", length = 45)
    private String clanarinaistekla;
    @Column(name = "status", length = 45)
    private String status;

    public Tabela() {
    }

    public Tabela(String ime, String prezime, String adresa, String datumuplate, String clanarinaistekla, String status) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.datumuplate = datumuplate;
        this.clanarinaistekla = clanarinaistekla;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;

        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);

    }

    public String getIme() {
        return this.ime;
    }

    public void setIme(String ime) {
        String oldIme = this.ime;

        this.ime = ime;
        changeSupport.firePropertyChange("ime", oldIme, ime);

    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime(String prezime) {
        String oldPrezime = this.prezime;

        this.prezime = prezime;
        changeSupport.firePropertyChange("prezime", oldPrezime, prezime);

    }

    public String getAdresa() {
        return this.adresa;
    }

    public void setAdresa(String adresa) {
        String oldAdresa = this.adresa;

        this.adresa = adresa;
        changeSupport.firePropertyChange("adresa", oldAdresa, adresa);

    }

    public String getDatumuplate() {
        return this.datumuplate;
    }

    public void setDatumuplate(String datumuplate) {
        String oldDatumuplate = this.datumuplate;

        this.datumuplate = datumuplate;
        changeSupport.firePropertyChange("datumuplate", oldDatumuplate, datumuplate);

    }

    public String getClanarinaIstekla() {
        return this.clanarinaistekla;
    }

    public void setClanarinaIstekla(String clanarinaistekla) {
        String oldClanarinaIstekla = this.clanarinaistekla;

        this.clanarinaistekla = clanarinaistekla;
        changeSupport.firePropertyChange("clanarinaistekla", oldClanarinaIstekla, clanarinaistekla);

    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        String oldstatus = this.status;

        this.status = status;
        changeSupport.firePropertyChange("Status", oldstatus, status);

    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
