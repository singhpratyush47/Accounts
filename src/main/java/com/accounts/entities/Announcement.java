package com.accounts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by PRATYUSH on 21-08-2018.
 */
@Entity
@Table(name = "announcement")
public class Announcement {

    @Id
    @Column(name = "announcement_id")
    private Integer announcementId;
    @Column(name = "unit_id")
    private Integer unitId;
    @Column(name = "status_id")
    private Integer statusId;
    @Column(name = "code")
    private String code;
    @Column(name = "title")
    private String title;
    @Column(name = "effective_date")
    private Date effectiveDate;
    @Column(name = "expiration_date")
    private Date expirationDate;
    @Column(name = "description")
    private String description;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "last_modified_by")
    private Integer lastModifiedBy;
    @Column(name = "last_modified_date")
    private Timestamp lastModifieddate;
    @Column(name = "ann_type")
    private String anntype;



    public Announcement() {

    }
    public Announcement(Integer announcementId, Integer unitId, Integer statusId, String code, String title, Date effectiveDate, Date expirationDate, String description, Integer createdBy, Timestamp createdDate, Integer lastModifiedBy, Timestamp lastModifieddate, String anntype) {
        this.announcementId = announcementId;
        this.unitId = unitId;
        this.statusId = statusId;
        this.code = code;
        this.title = title;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
        this.description = description;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifieddate = lastModifieddate;
        this.anntype = anntype;
    }

    public Integer getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Integer announcementId) {
        this.announcementId = announcementId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(Integer lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifieddate() {
        return lastModifieddate;
    }

    public void setLastModifieddate(Timestamp lastModifieddate) {
        this.lastModifieddate = lastModifieddate;
    }

    public String getAnntype() {
        return anntype;
    }

    public void setAnntype(String anntype) {
        this.anntype = anntype;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "announcementId=" + announcementId +
                ", unitId=" + unitId +
                ", statusId=" + statusId +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", expirationDate=" + expirationDate +
                ", description='" + description + '\'' +
                ", createdBy=" + createdBy +
                ", createdDate=" + createdDate +
                ", lastModifiedBy=" + lastModifiedBy +
                ", lastModifieddate=" + lastModifieddate +
                ", anntype='" + anntype + '\'' +
                '}';
    }
}
