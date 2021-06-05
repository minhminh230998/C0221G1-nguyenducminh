package model.Repository;

import model.bean.customer.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String SELECT_CUSTOMER = "select * from khach_hang;";
    final String CREATE_CUSTOMER = "insert into khach_hang(id_loai_khach,ten_khach_hang,ngay_sinh,gioi_tinh,so_CMND,so_DT,email,dia_chi) values(?,?,?,?,?,?,?,?);";
    final String SELECT_BY_ID = "select * from khach_hang where id_khach_hang=?;";
    final String DELETE_CUSTOMER = "delete from khach_hang where id_khach_hang=?;";
    final String EDIT_CUSTOMER = "update khach_hang set id_loai_khach=?, ten_khach_hang=?,ngay_sinh=?,gioi_tinh=?,so_CMND=?,so_DT=?,email=?,dia_chi=? where id_khach_hang=?";
    final String SELECT_BY_NAME = "select* from khach_hang where ten_khach_hang like ?;";

    public List<Customer> findAll() {
        Connection connection = baseRepository.connectDataBase();
        List<Customer> list = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_khach_hang");
                int id_customerType = resultSet.getInt("id_loai_khach");
                String name = resultSet.getString("ten_khach_hang");
                String birthday = resultSet.getString("ngay_sinh");
                String gender = resultSet.getString("gioi_tinh");
                int idCard = resultSet.getInt("so_CMND");
                String phone = resultSet.getString("so_DT");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                list.add(new Customer(id, id_customerType, name, birthday, gender, idCard, phone, email, address));

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Customer findById(int id) {
        Customer customer = null;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id_khach_hang");
                int id_customerType = resultSet.getInt("id_loai_khach");
                String name = resultSet.getString("ten_khach_hang");
                String birthday = resultSet.getString("ngay_sinh");
                String gender = resultSet.getString("gioi_tinh");
                int idCard = resultSet.getInt("so_CMND");
                String phone = resultSet.getString("so_DT");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                customer = new Customer(id1, id_customerType, name, birthday, gender, idCard, phone, email, address);

            }
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public boolean deleteCustomer(int id) {
        boolean rowDelete = false;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER);
            statement.setInt(1, id);
            rowDelete = statement.executeUpdate() > 0;
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public void createCustomer(Customer customer) {
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(CREATE_CUSTOMER);

            statement.setInt(1, customer.getIdCustomerType());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getBirthday());
            statement.setString(4, customer.getGender());
            statement.setInt(5, customer.getIdCard());
            statement.setString(6, customer.getPhone());
            statement.setString(7, customer.getEmail());
            statement.setString(8, customer.getAddress());
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean editCustomer(Customer customer) {
        boolean check = false;
        Connection connection = baseRepository.connectDataBase();
        try {

            PreparedStatement statement = connection.prepareStatement(EDIT_CUSTOMER);
            statement.setInt(1, customer.getIdCustomerType());
            statement.setString(2, customer.getName());
            statement.setString(3, customer.getBirthday());
            statement.setString(4, customer.getGender());
            statement.setInt(5, customer.getIdCard());
            statement.setString(6, customer.getPhone());
            statement.setString(7, customer.getEmail());
            statement.setString(8, customer.getAddress());
            statement.setInt(9, customer.getId());
            System.out.println(statement.toString());
            check = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    public List<Customer> findByName(String name) {
        List<Customer> customer = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_NAME);
            statement.setString(1,"%"+ name+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_khach_hang");
                int id_customerType = resultSet.getInt("id_loai_khach");
                String name1 = resultSet.getString("ten_khach_hang");
                String birthday = resultSet.getString("ngay_sinh");
                String gender = resultSet.getString("gioi_tinh");
                int idCard = resultSet.getInt("so_CMND");
                String phone = resultSet.getString("so_DT");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                customer.add(new Customer(id, id_customerType, name1, birthday, gender, idCard, phone, email, address));

            }
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }
}