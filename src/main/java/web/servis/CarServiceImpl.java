package web.servis;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> createAndVerification(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"101","bmv1"));
        cars.add(new Car(2,"202","bmv2"));
        cars.add(new Car(3,"303","bmv3"));
        cars.add(new Car(4,"404","bmv4"));
        cars.add(new Car(5,"505","bmv5"));
        if (count >= 0 && count < 5)
            return cars.subList(0, count);
        return cars;
    }
}
