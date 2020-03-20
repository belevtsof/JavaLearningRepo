package service;

import pojo.Coin;

public class CoinService {

    public CoinService() {
    }

    public Coin buildNewCoin(long id, String imageUrl, String country, int value, short year, String currency) {
        return new Coin(id, imageUrl, country, value, year, currency);
    }

    public Coin findByCountry(final String country) {
        return null;
    }
}
