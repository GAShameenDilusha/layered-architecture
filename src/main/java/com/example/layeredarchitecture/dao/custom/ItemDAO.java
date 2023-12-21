package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;

public interface ItemDAO extends CrudDAO<ItemDTO> {
    /*ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    boolean SaveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    boolean deleteItem(String code) throws SQLException, ClassNotFoundException;
    boolean existItem (String code) throws SQLException, ClassNotFoundException ;
    String generateNextId() throws SQLException, ClassNotFoundException;*/
    ItemDTO findItem(String code) throws SQLException, ClassNotFoundException;
    /*ItemDTO searchItem(Object newItemCode) throws SQLException, ClassNotFoundException;


    ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;*/
}
