package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Concrete.Base.UserDao;
import Constants.Messages;
import Entities.User;

public class UserManager implements UserService {
    private UserDao _userDao;
    private UserCheckService _userCheckService;

    public UserManager(UserDao _userDao, UserCheckService _userCheckService) {
        System.out.println(Messages.userTitle);
        this._userDao = _userDao;
        this._userCheckService = _userCheckService;
    }

    @Override
    public void add(User user) {
        if(_userCheckService.checkIfRealPerson(user)){
            var result = _userDao.add(user);
            System.out.println(Messages.createdUser +" | "+ Messages.validationUserSuccess);
            System.out.println(Messages.firstName+result.get_firstName() +" "+ Messages.lastName+ result.get_lastName() + " " + Messages.userName+result.get_userName() + " " + Messages.password +result.get_password());
        }else{
            System.out.println(Messages.validationUserUnSuccess);
        }
    }

    @Override
    public void delete(User user) {
        var result = _userDao.delete(user);
        System.out.println(Messages.deletedUser);
        System.out.println(Messages.userName+result.get_userName());
    }

    @Override
    public void update(User user) {
        var result = _userDao.update(user);
        System.out.println(Messages.updatedUser);
        System.out.println(Messages.firstName+result.get_firstName() +" "+ Messages.lastName+ result.get_lastName() + " " + Messages.userName+result.get_userName() + " " + Messages.password +result.get_password());
    }
}
