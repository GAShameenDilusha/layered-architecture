package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {
     /*ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
     boolean SaveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
     boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
     boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
     boolean existCustomer(String id) throws SQLException, ClassNotFoundException;
     String generateNextId() throws SQLException, ClassNotFoundException;
     String searchCustomer(Object newValue) throws SQLException, ClassNotFoundException;*/

    void customerNameAddress();

}
