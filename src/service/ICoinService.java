package service;

import pojo.Coin;

public interface ICoinService {

        Coin getCoinByCountry(final String country);
        Coin getCoinByValue(final int value);
        Coin getCoinByYear(final Short year);
        Coin getCoinByCurrency(final String currency);
}
