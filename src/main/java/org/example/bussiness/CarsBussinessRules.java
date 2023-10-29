package org.example.bussiness;
//iş kuralları

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDataAccess;
import org.example.dataAccess.CarDataDao;
import org.example.dataAccess.NewCarDataAccess;
import org.example.entities.Cars;

import java.util.List;

public class CarsBussinessRules {
    private CarDataDao carDataDao;
    private List<Logger> loggers;


    //CarBussinessRules new'lendiğinde bana bir dataAccess ver.
    public CarsBussinessRules(CarDataDao carDataDao, List<Logger> loggers) {
        this.carDataDao = carDataDao;
        this.loggers = loggers;
    }

    public void add (Cars cars) throws Exception {
        if (cars.getPrice()<1000){
            System.out.println("1000 TL'nin altında aracımız bulunmamaktadı!");
        }

        if (cars.getYear()==2023){
            throw new Exception("Sıfır araç satışımız mevcut değildir.");
        }

        //interface onu implement eden sınıfın referansını tutabilir.
        //CarDataDao carDataAccess = new CarDataAccess();
        carDataDao.add(cars);

        for(Logger logger : loggers){
            logger.log(cars.getModel());
        }
    }
}
