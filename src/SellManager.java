public class SellManager implements SellService{
    private SellDao _sellDao;
    Sell _sell1;
    User _user1;

    public SellManager(SellDao _sellDao) {
        System.out.println(Messages.sellTitle);
        this._sellDao = _sellDao;
    }

    @Override
    public void sell(Sell sell, User user,Campaign campaign) {
        //id 0 dan büyükse
        if(sell.get_id()>0 && user.get_id()>0){
            //id birbirlerine eşitse Satış Başarılı
            if(sell.get_id() == user.get_id()){
                this.list(sell,user,campaign);
            }else{
                System.out.println(Messages.sellFailed);
            }
        }else{
            System.out.println(Messages.sellFailed);
        }
    }

    //Clean Code
    private void list(Sell sell, User user,Campaign campaign) {
        if(sell!=null && user !=null){
            System.out.println(Messages.sellSpecialForYouCampaign);
            System.out.println(Messages.campaignName+campaign.get_campaignName() + " "+Messages.campaignDiscount+campaign.get_discount());
            System.out.println(Messages.sellFullName+user.get_firstName() + " "+user.get_lastName()+ " | " +Messages.sellGameName+sell.get_gameName() + " "+Messages.sellGamePrice+ sell.get_gamePrice() +Messages.sellPriceType);
        }
    }
}
