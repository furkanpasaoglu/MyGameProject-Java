import business.abstracts.CampaignService;
import business.abstracts.SellService;
import business.abstracts.UserService;
import core.adapters.MernisManagerAdapter;
import business.concretes.CampaignManager;
import business.concretes.SellManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateCampaignDao;
import dataAccess.concretes.HibernateSellDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.Campaign;
import entities.concretes.Sell;
import entities.concretes.User;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Campaign
        CampaignService _campaignService = new CampaignManager(new HibernateCampaignDao());
        Campaign campaign1 = new Campaign(1,"Deneme",15);
        Campaign updatedcampaign1 = new Campaign(1,"Deneme 2",15);
        _campaignService.add(campaign1);
        _campaignService.update(updatedcampaign1);
        _campaignService.delete(campaign1);

        System.out.println("\n");

        //Users
        UserService _userService = new UserManager(new HibernateUserDao(),new MernisManagerAdapter());
        //CheckUser
        User user1 = new User(1,"Furkan","Paşaoğlu","12345678910",new Date(1999,8,6),"furkan123","123");
        User updateduser1 = new User(1,"Furkan","Paşaoğlu","12345678910",new Date(1985,8,6),"furkan123","123456");
        _userService.add(user1);
//        _userService.update(updateduser1);
//        _userService.delete(user1);


        System.out.println("\n");

        //Sells
        SellService _sellService = new SellManager(new HibernateSellDao());
        Sell sell1 = new Sell(1,"GTA V",120);
        _sellService.sell(sell1,user1,campaign1);

    }
}
