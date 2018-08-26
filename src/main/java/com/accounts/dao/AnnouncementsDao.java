package com.accounts.dao;

import com.accounts.entities.Announcement;

import java.util.List;

/**
 * Created by PRATYUSH on 21-08-2018.
 */
public interface AnnouncementsDao {

    public void addAnnouncement(Announcement announcement);

    public void editAnnouncement(Announcement announcement, int announcementId);

    public void deleteAnnouncement(int announcementId);

    public Announcement find(int announcementId);

    public List< Announcement > findAll();

}
