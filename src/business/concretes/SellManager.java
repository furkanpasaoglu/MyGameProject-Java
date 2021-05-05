package business.concretes;

import business.abstracts.SellService;
import dataAccess.abstracts.SellDao;
import business.constants.Messages;
import entities.concretes.Campaign;
import entities.concretes.Sell;
import entities.concretes.User;

public class SellManager implements SellService {
    private SellDao _sellDao;
    Sell _sell1;
    User _user1;

    public SellManager(SellDao _sellDao) {
        this._sellDao = _sellDao;
    }

    @Override
    public void sell(Sell sell, User user, Campaign campaign) {
        if(this.check(sell,user)){
            this.list(sell,user,campaign);
        }else{
            System.out.println(Messages.sellFailed);
        }
    }

    //Clean Code
    private void list(Sell sell, User user, Campaign campaign) {
        if(sell!=null && user !=null){
            System.out.println(Messages.sellSpecialForYouCampaign);
            System.out.println(Messages.campaignName+campaign.get_campaignName() + " "+ Messages.campaignDiscount+campaign.get_discount());
            System.out.println(Messages.sellFullName+user.get_firstName() + " "+user.get_lastName()+ " | " + Messages.sellGameName+sell.get_gameName() + " "+ Messages.sellGamePrice+ sell.get_gamePrice() + Messages.sellPriceType);
        }
    }

    private boolean check(Sell sell,User user){
        if(sell.get_id()>0 && user.get_id()>0){
            if(sell.get_id() == user.get_id()){
                return true;

            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
