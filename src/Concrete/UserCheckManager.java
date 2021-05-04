package Concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

    @Override
    public boolean checkIfRealPerson(User user) {
        if(user.get_nationalIdentity() =="12345678910" && user.get_dateOfBirth()=="06.08.1999" && user.get_firstName() =="Furkan" && user.get_lastName()=="Paşaoğlu"){
            return true;
        }
        else{
            return false;
        }
    }
}
