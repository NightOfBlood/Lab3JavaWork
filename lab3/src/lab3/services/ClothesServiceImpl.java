package lab3.services;

import lab3.models.Clothes;
import lab3.repository.ClothesRepository;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "lab3.services.ClothesService")
@HandlerChain(file="handler-chain.xml")

public class ClothesServiceImpl implements ClothesService {

    ClothesRepository clothesRepository = ClothesRepository.getInstance();

    @WebMethod
    public List<Clothes> getClothes() {
        return clothesRepository.getClothes();
    }


}
