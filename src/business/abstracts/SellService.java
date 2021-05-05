package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Sell;
import entities.concretes.User;

public interface SellService {
    void sell(Sell sell, User user, Campaign campaign);
}
