package kfs.kfsbotinforeal.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import kfs.kfsbot.domain.BotNoContact;
import kfs.kfscrm.domain.KfsContact;

/**
 *
 * @author pavedrim
 */
@Entity
public class InfoReal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private KfsContact contact;
    @OneToOne
    private BotNoContact noContact;
    
    private String advertName;
    @Column(length = 50)
    private String price;
    @Lob
    private byte[] advertText;
    private String activityName;
    @Column(length = 500)
    private String realityTypeName;
    @Column(length = 500)
    private String additionalInformation;
    //
    
    private String link;
    private String localityName;
    @Column(length = 50)
    private String serverName;
    @Column(length = 50)
    private String contactJmeno;
    @Column(length = 20)
    private String contactTelefon;
    @Column(length = 20)
    private String contactMobil;
    private String contactEmail;
    @Column(length = 50)
    private String contactIcq;
    private String contactWeb;
    @Column(length = 50)
    private String contactSkype;
    private String contactUNKNOWN;
    @Column(length = 32)
    private String status;
    private Timestamp imported;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public KfsContact getContact() {
        return contact;
    }

    public void setContact(KfsContact contact) {
        this.contact = contact;
    }

    public BotNoContact getNoContact() {
        return noContact;
    }

    public void setNoContact(BotNoContact noContact) {
        this.noContact = noContact;
    }

    public String getAdvertName() {
        return advertName;
    }

    public void setAdvertName(String advertName) {
        this.advertName = advertName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public byte[] getAdvertText() {
        return advertText;
    }

    public void setAdvertText(byte[] advertText) {
        this.advertText = advertText;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getRealityTypeName() {
        return realityTypeName;
    }

    public void setRealityTypeName(String realityTypeName) {
        this.realityTypeName = realityTypeName;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getContactJmeno() {
        return contactJmeno;
    }

    public void setContactJmeno(String contactJmeno) {
        this.contactJmeno = contactJmeno;
    }

    public String getContactTelefon() {
        return contactTelefon;
    }

    public void setContactTelefon(String contactTelefon) {
        this.contactTelefon = contactTelefon;
    }

    public String getContactMobil() {
        return contactMobil;
    }

    public void setContactMobil(String contactMobil) {
        this.contactMobil = contactMobil;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactIcq() {
        return contactIcq;
    }

    public void setContactIcq(String contactIcq) {
        this.contactIcq = contactIcq;
    }

    public String getContactWeb() {
        return contactWeb;
    }

    public void setContactWeb(String contactWeb) {
        this.contactWeb = contactWeb;
    }

    public String getContactSkype() {
        return contactSkype;
    }

    public void setContactSkype(String contactSkype) {
        this.contactSkype = contactSkype;
    }

    public String getContactUNKNOWN() {
        return contactUNKNOWN;
    }

    public void setContactUNKNOWN(String contactUNKNOWN) {
        this.contactUNKNOWN = contactUNKNOWN;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getImported() {
        return imported;
    }

    public void setImported(Timestamp imported) {
        this.imported = imported;
    }
    
}
