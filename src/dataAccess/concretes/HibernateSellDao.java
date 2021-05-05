package dataAccess.concretes;

import core.dataaccess.concretes.BaseRepository;
import dataAccess.abstracts.SellDao;
import entities.concretes.Sell;

public class HibernateSellDao extends BaseRepository<Sell> implements SellDao {
}
