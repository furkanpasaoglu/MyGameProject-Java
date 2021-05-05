package core.adapters;

import MernisService.PIFKPSPublicSoap;

public class MernisManagerAdapter implements MernisService {
    PIFKPSPublicSoap _publicSoap;

    @Override
    public boolean TCKimlikNoDogrula(long tCKimlikNo, String ad, String soyad, Integer dogumYili) {
        try {
            _publicSoap = new PIFKPSPublicSoap();
            return _publicSoap.TCKimlikNoDogrula(tCKimlikNo, ad, soyad, dogumYili);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}