package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import business.constants.Messages;
import entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
    private CampaignDao _campaignDao;

    public CampaignManager(CampaignDao _campaignDao) {
        System.out.println(Messages.campaignTitle);
        this._campaignDao = _campaignDao;
    }

    public void add(Campaign campaign){
        var result = _campaignDao.add(campaign);
        System.out.println(Messages.createdCampaign);
        System.out.println(Messages.campaignName+result.get_campaignName() + Messages.campaignDiscount + result.get_discount());
    }

    @Override
    public void delete(Campaign campaign) {
        var result = _campaignDao.delete(campaign);
        System.out.println(Messages.deletedCampaign);
        System.out.println(Messages.campaignName+result.get_campaignName());
    }

    @Override
    public void update(Campaign campaign) {
        var result = _campaignDao.update(campaign);
        System.out.println(Messages.updatedCampaign);
        System.out.println(Messages.campaignName+result.get_campaignName() + Messages.campaignDiscount+ result.get_discount());
    }
}
