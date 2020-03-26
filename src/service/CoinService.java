package service;

import pojo.Coin;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class CoinService implements ICoinService {

    private List <Coin> coinsRepository = new ArrayList<>();

    @Override
    public void addCoin(final Coin coin) {
        if (coin == null) {
            throw new InvalidParameterException("Given argument is null");
        }
        coinsRepository.add(coin);
    }

    @Override
    public void removeCoin(final Coin coin) {
        coinsRepository.remove(coin);
    }

    @Override
    public void getCoinsByCountry(final String country) {

    }

    @Override
    public List<Coin> getCoinsByValue(int value) {
        return null;
    }

    @Override
    public List<Coin> getCoinsByYear(Short year) {
        return null;
    }

    @Override
    public List<Coin> getCoinsByCurrency(String currency) {
        return null;
    }
}
