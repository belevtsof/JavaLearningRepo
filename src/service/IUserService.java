package service;

import pojo.User;

import java.util.ArrayList;

public interface IUserService {

    void addUser(User user);
    void removeUser(User user);

    User getUserByName(final String name);
    ArrayList<User> getAllUsers();
    ArrayList<User> getUsersByLocation(final String location);
}
