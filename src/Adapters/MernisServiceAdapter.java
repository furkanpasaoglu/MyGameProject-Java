package Adapters;

import Abstract.UserCheckService;
import Entities.User;
import MernisService.PIFKPSPublicSoap;

public class MernisServiceAdapter implements UserCheckService {
    PIFKPSPublicSoap _publicSoap;
    @Override
    public boolean checkIfRealPerson(User user) {
        _publicSoap = new PIFKPSPublicSoap();
        try {
             var result =_publicSoap.TCKimlikNoDogrula(Long.valueOf(user.get_nationalIdentity()),user.get_firstName(), user.get_lastName(),user.get_dateOfBirth().getYear());
             if(result){
                 return true;
             }
             else{
                 return false;
             }
         }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
