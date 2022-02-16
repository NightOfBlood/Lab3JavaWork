package lab3.services;

import lab3.models.Clothes;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ClothesService {
    @WebMethod
    public List<Clothes> getClothes();

}
