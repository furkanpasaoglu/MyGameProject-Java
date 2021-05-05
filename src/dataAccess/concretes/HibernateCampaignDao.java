package dataAccess.concretes;

import core.dataaccess.concretes.BaseRepository;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class HibernateCampaignDao extends BaseRepository<Campaign> implements CampaignDao {
}
