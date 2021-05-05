package dataAccess.concretes;

import core.dataaccess.concretes.BaseRepository;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao extends BaseRepository<User>implements UserDao {
}
