package Project.MagiCarAi.mappers;

import Project.MagiCarAi.dto.CarDTO;
import Project.MagiCarAi.model.CarModel;

public class CarMapper {

    public CarModel map(CarDTO carDTO){
        CarModel carModel = new CarModel();
        carModel.setMarcas(carModel.getMarcas());
        carModel.setCategoria(carModel.getCategoria());
        carModel.setTipo(carModel.getTipo());
        carModel.setPreco_mim(carModel.getPreco_mim());
        carModel.setPreco_max(carModel.getPreco_max());
        carModel.setAno_mim(carModel.getAno_mim());
        carModel.setAno_max(carModel.getAno_max());

        return carModel;

    }

    public CarDTO map(CarModel carModel){
        CarDTO carDTO = new CarDTO();
        carDTO.setMarcas(carDTO.getMarcas());
        carDTO.setCategoria(carDTO.getCategoria());
        carDTO.setTipo(carDTO.getTipo());
        carDTO.setTipo(carDTO.getTipo());
        carDTO.setPreco_mim(carDTO.getPreco_mim());
        carDTO.setPreco_max(carDTO.getPreco_max());
        carDTO.setAno_mim(carDTO.getAno_mim());
        carDTO.setAno_max(carDTO.getAno_max());

        return carDTO;
    }
}
