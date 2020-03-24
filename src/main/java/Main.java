package main.java;

import service.ICoinService;
import service.IUserService;

public class Main {
    public static void main(String [] args){
        System.out.println("Hello World!!");
    }

    class Coin implements ICoinService{

        @Override
        public pojo.Coin getCoinByCountry(String country) {
            return null;
        }

        @Override
        public pojo.Coin getCoinByValue(int value) {
            return null;
        }

        @Override
        public pojo.Coin getCoinByYear(Short year) {
            return null;
        }

        @Override
        public pojo.Coin getCoinByCurrency(String currency) {
            return null;
        }
    }

    class User implements IUserService{

        @Override
        public pojo.User getUsersByName(String name) {
            return null;
        }

        @Override
        public pojo.User getUsersByLocation(String location) {
            return null;
        }
    }
}