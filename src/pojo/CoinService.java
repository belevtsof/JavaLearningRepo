package pojo;

public class CoinService extends Coin {

    public CoinService(long id, String imageUrl, String country, int value, short year, String currency) {
        super(id, imageUrl, country, value, year, currency);
    }

    public static void show(String country){
        System.out.println("Test" + country);
    }
}
