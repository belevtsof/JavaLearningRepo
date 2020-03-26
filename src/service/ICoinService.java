package service;

import pojo.Coin;

import java.util.ArrayList;
import java.util.List;

public interface ICoinService {

        void addCoin(Coin coin);
        void removeCoin(Coin coin);

        void getCoinsByCountry(String country);
        List<Coin> getCoinsByValue(int value);
        List<Coin> getCoinsByYear(Short year);
        List<Coin> getCoinsByCurrency(String currency);
}
