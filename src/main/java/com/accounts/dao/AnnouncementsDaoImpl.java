package com.accounts.dao;

import com.accounts.entities.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PRATYUSH on 21-08-2018.
 */
@Repository("announcementDao")
public class AnnouncementsDaoImpl implements AnnouncementsDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
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
        Announcement announcement=(Announcement)jdbcTemplate.queryForObject("select * from announcement where announcement.announcement_id=?",
                new Object[]{announcementId}, new BeanPropertyRowMapper(Announcement.class));
        return announcement;
    }

    @Override
    public List<Announcement> findAll() {
        List<Announcement> listOfAnnouncements=jdbcTemplate.query("select * from announcement",
                new BeanPropertyRowMapper(Announcement.class));
        return listOfAnnouncements;
    }
}
