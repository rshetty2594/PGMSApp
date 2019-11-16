/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmsapp;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author urn
 */
@Entity
@Table(name = "db_grievance", catalog = "ugms", schema = "")
@NamedQueries({
    @NamedQuery(name = "DbGrievance.findAll", query = "SELECT d FROM DbGrievance d")
    , @NamedQuery(name = "DbGrievance.findByGId", query = "SELECT d FROM DbGrievance d WHERE d.gId = :gId")
    , @NamedQuery(name = "DbGrievance.findByUEmail", query = "SELECT d FROM DbGrievance d WHERE d.uEmail = :uEmail")
    , @NamedQuery(name = "DbGrievance.findByGCity", query = "SELECT d FROM DbGrievance d WHERE d.gCity = :gCity")
    , @NamedQuery(name = "DbGrievance.findByGAddress", query = "SELECT d FROM DbGrievance d WHERE d.gAddress = :gAddress")
    , @NamedQuery(name = "DbGrievance.findByGLandmark", query = "SELECT d FROM DbGrievance d WHERE d.gLandmark = :gLandmark")
    , @NamedQuery(name = "DbGrievance.findByGCategory", query = "SELECT d FROM DbGrievance d WHERE d.gCategory = :gCategory")
    , @NamedQuery(name = "DbGrievance.findByGDescription", query = "SELECT d FROM DbGrievance d WHERE d.gDescription = :gDescription")
    , @NamedQuery(name = "DbGrievance.findByGStatus", query = "SELECT d FROM DbGrievance d WHERE d.gStatus = :gStatus")})
public class DbGrievance implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "g_id")
    private Long gId;
    @Basic(optional = false)
    @Column(name = "u_email")
    private String uEmail;
    @Basic(optional = false)
    @Column(name = "g_city")
    private String gCity;
    @Basic(optional = false)
    @Column(name = "g_address")
    private String gAddress;
    @Basic(optional = false)
    @Column(name = "g_landmark")
    private String gLandmark;
    @Basic(optional = false)
    @Column(name = "g_category")
    private String gCategory;
    @Basic(optional = false)
    @Column(name = "g_description")
    private String gDescription;
    @Lob
    @Column(name = "g_image")
    private byte[] gImage;
    @Basic(optional = false)
    @Column(name = "g_status")
    private String gStatus;

    public DbGrievance() {
    }

    public DbGrievance(Long gId) {
        this.gId = gId;
    }

    public DbGrievance(Long gId, String uEmail, String gCity, String gAddress, String gLandmark, String gCategory, String gDescription, String gStatus) {
        this.gId = gId;
        this.uEmail = uEmail;
        this.gCity = gCity;
        this.gAddress = gAddress;
        this.gLandmark = gLandmark;
        this.gCategory = gCategory;
        this.gDescription = gDescription;
        this.gStatus = gStatus;
    }

    public Long getGId() {
        return gId;
    }

    public void setGId(Long gId) {
        Long oldGId = this.gId;
        this.gId = gId;
        changeSupport.firePropertyChange("GId", oldGId, gId);
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        String oldUEmail = this.uEmail;
        this.uEmail = uEmail;
        changeSupport.firePropertyChange("UEmail", oldUEmail, uEmail);
    }

    public String getGCity() {
        return gCity;
    }

    public void setGCity(String gCity) {
        String oldGCity = this.gCity;
        this.gCity = gCity;
        changeSupport.firePropertyChange("GCity", oldGCity, gCity);
    }

    public String getGAddress() {
        return gAddress;
    }

    public void setGAddress(String gAddress) {
        String oldGAddress = this.gAddress;
        this.gAddress = gAddress;
        changeSupport.firePropertyChange("GAddress", oldGAddress, gAddress);
    }

    public String getGLandmark() {
        return gLandmark;
    }

    public void setGLandmark(String gLandmark) {
        String oldGLandmark = this.gLandmark;
        this.gLandmark = gLandmark;
        changeSupport.firePropertyChange("GLandmark", oldGLandmark, gLandmark);
    }

    public String getGCategory() {
        return gCategory;
    }

    public void setGCategory(String gCategory) {
        String oldGCategory = this.gCategory;
        this.gCategory = gCategory;
        changeSupport.firePropertyChange("GCategory", oldGCategory, gCategory);
    }

    public String getGDescription() {
        return gDescription;
    }

    public void setGDescription(String gDescription) {
        String oldGDescription = this.gDescription;
        this.gDescription = gDescription;
        changeSupport.firePropertyChange("GDescription", oldGDescription, gDescription);
    }

    public byte[] getGImage() {
        return gImage;
    }

    public void setGImage(byte[] gImage) {
        byte[] oldGImage = this.gImage;
        this.gImage = gImage;
        changeSupport.firePropertyChange("GImage", oldGImage, gImage);
    }

    public String getGStatus() {
        return gStatus;
    }

    public void setGStatus(String gStatus) {
        String oldGStatus = this.gStatus;
        this.gStatus = gStatus;
        changeSupport.firePropertyChange("GStatus", oldGStatus, gStatus);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gId != null ? gId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DbGrievance)) {
            return false;
        }
        DbGrievance other = (DbGrievance) object;
        if ((this.gId == null && other.gId != null) || (this.gId != null && !this.gId.equals(other.gId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pgmsapp.DbGrievance[ gId=" + gId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
