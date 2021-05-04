package Abstract;

import Entities.Campaign;
import Entities.Sell;
import Entities.User;

public interface SellService {
    void sell(Sell sell, User user, Campaign campaign);
}
