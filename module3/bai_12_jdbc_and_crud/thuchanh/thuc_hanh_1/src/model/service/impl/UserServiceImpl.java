package model.service.impl;

import model.bean.User;
import model.repository.UserRepository;
import model.service.IUserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService {
    UserRepository userRepository=new UserRepository();
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public boolean update( User user) {
        return userRepository.update(user);
    }

    @Override
    public boolean deleteUser(int id) {
            return userRepository.deleteUser(id);
    }

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }
}
