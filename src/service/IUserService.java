package service;

import pojo.User;

public interface IUserService {

    User getUsersByName(final String name);
    User getUsersByLocation(final String location);
}
