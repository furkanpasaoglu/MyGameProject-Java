package business.concretes;

import business.abstracts.UserService;
import core.adapters.MernisManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import business.constants.Messages;
import entities.concretes.User;

public class UserManager implements UserService {
    private UserDao _userDao;
    private MernisManagerAdapter _mernisManagerAdapter;

    public UserManager(UserDao _userDao, MernisManagerAdapter _mernisManagerAdapter) {
        System.out.println(Messages.userTitle);
        this._userDao = _userDao;
        this._mernisManagerAdapter = _mernisManagerAdapter;
    }

    @Override
    public void add(User user) {
        if(_mernisManagerAdapter.TCKimlikNoDogrula(Long.valueOf(user.get_nationalIdentity()),user.get_firstName(), user.get_lastName(),user.get_dateOfBirth().getYear())){
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
