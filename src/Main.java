public class Main {

    public static void main(String[] args) {
        //Campaign
        CampaignService _campaignService = new CampaignManager(new CampaignDao());
        Campaign campaign1 = new Campaign(1,"Deneme",15);
        Campaign updatedcampaign1 = new Campaign(1,"Deneme 2",15);
        _campaignService.add(campaign1);
        _campaignService.update(updatedcampaign1);
        _campaignService.delete(campaign1);

        System.out.println("\n");

        //User
        UserService _userService = new UserManager(new UserDao());
        //CheckUser
        User user1 = new User(1,"Furkan1","Paşaoğlu","12345678910","06.08.1999","furkan123","123");
        User updateduser1 = new User(1,"Furkan","Paşaoğlu","12345678910","06.08.1999","furkan123","123456");
        _userService.add(user1);
//        _userService.update(updateduser1);
//        _userService.delete(user1);


        System.out.println("\n");

        //Sell
        SellService _sellService = new SellManager(new SellDao());
        Sell sell1 = new Sell(1,"GTA V",120);
        _sellService.sell(sell1,user1,campaign1);

    }
}
