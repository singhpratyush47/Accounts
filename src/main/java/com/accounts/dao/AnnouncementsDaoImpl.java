package com.accounts.dao;

import com.accounts.entities.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by PRATYUSH on 21-08-2018.
 */
@Repository
@Qualifier("announcementDao")
public class AnnouncementsDaoImpl implements AnnouncementsDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addAnnouncement(Announcement announcement) {
    }

    @Override
    public void editAnnouncement(Announcement announcement, int announcementId) {

    }

    @Override
    public void deleteAnnouncement(int announcementId) {

    }

    @Override
    public Announcement find(int announcementId) {
        return null;
    }

    @Override
    public List<Announcement> findAll() {
        return entityManager.createQuery("select announcement  from Announcement announcement", Announcement.class).getResultList();
    }
}
