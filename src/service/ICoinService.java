package service;

import pojo.Coin;

import java.util.ArrayList;

public interface ICoinService {

        void addCoin(Coin coin);
        void removeCoin(Coin coin);

        void getCoinsByCountry(final String country);
        ArrayList<Coin> getCoinsRepositoryByValue(final int value);
        ArrayList<Coin> getCoinsByYear(final Short year);
        ArrayList<Coin> getCoinsByCurrency(final String currency);
}
