/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class UserDAO {

    ArrayList<UserDTO> list = new ArrayList<>();

    public UserDAO() {
        list.add(new UserDTO("admin", "admin", "Nguyen van A"));
        list.add(new UserDTO("user1", "user1", "Anh do mixi"));

    }

    public UserDTO searchById(String id) {
        for (UserDTO userDTO : list) {
            if (userDTO.getUsername().equalsIgnoreCase(id)) {
                return userDTO;
            }
        }
        return null;
    }

    public UserDTO login(String Username, String Password) {
        UserDTO user = searchById(Username);
        if (user != null && user.getPassword().equals(Password)) {
            return user;
        } else {
            return null;
        }
    }
}
