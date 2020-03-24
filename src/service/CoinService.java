package service;

import com.sun.jdi.connect.Connector;
import pojo.Coin;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

public class CoinService implements ICoinService {

    private ArrayList <Coin> CoinsRepository = new ArrayList<>();

    @Override
    public void addCoin(Coin coin) {
        if (coin == null)throw new InvalidParameterException(coin.toString());

        CoinsRepository.add(coin);
    }

    @Override
    public void removeCoin(Coin coin) {

    }

    @Override
    public void getCoinsByCountry(String country) {

    }

    @Override
    public ArrayList<Coin> getCoinsRepositoryByValue(int value) {
        return null;
    }

    @Override
    public ArrayList<Coin> getCoinsByYear(Short year) {
        return null;
    }

    @Override
    public ArrayList<Coin> getCoinsByCurrency(String currency) {
        return null;
    }
}
