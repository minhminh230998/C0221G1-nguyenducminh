package model.service;

import model.bean.service.House;
import model.bean.service.Room;
import model.bean.service.Villa;

import java.util.List;

public interface IService {
    public void createVilla(Villa villa);

    public void createHouse(House house);

    public void createRoom(Room room);

    public Villa findById(int id);
    public List<Villa> findAll();
}
