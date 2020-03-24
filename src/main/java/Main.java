package main.java;

import pojo.Coin;
import service.CoinService;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class Main {
    public static void main(String [] args) throws MalformedURLException {
        System.out.println("Hello World!!");

        CoinService coinService = new CoinService();

        coinService.addCoin(new Coin(1, new URL("path"), "Canada", 50, new Date(2020), "Dollar"));
    }
}