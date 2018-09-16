package com.accounts.services;

import com.accounts.dao.AnnouncementsDao;
import com.accounts.entities.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by PRATYUSH on 21-08-2018.
 */
@Service("announcementService")
@Transactional
public class AnnouncementsServiceImpl implements AnnouncementsService {

    @Autowired
    AnnouncementsDao announcementDao;
    @Override
    public List<Announcement> getAnnouncements() {
        return announcementDao.findAll();
    }
}
