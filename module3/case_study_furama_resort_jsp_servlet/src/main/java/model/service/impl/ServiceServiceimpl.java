package model.service.impl;

import model.Repository.ServiceRepository;
import model.bean.service.House;
import model.bean.service.Room;
import model.bean.service.Villa;
import model.service.IService;

import java.util.List;

public class ServiceServiceimpl implements IService {
    ServiceRepository serviceRepository=new ServiceRepository();
    @Override
    public void createVilla(Villa villa) {
        serviceRepository.createVilla(villa);
    }

    @Override
    public void createHouse(House house) {
        serviceRepository.createHouse(house);
    }

    @Override
    public void createRoom(Room room){ serviceRepository.createRoom(room);
    }

    @Override
    public Villa findById(int id) {
        return serviceRepository.findById(id);
    }

    @Override
    public List<Villa> findAll() {
        return serviceRepository.findAll();
    }
}
