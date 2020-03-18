package pojo;

public class coinService extends Coin {

    public coinService(long id, String imageUrl, String country, int value, short year, String currency) {
        super(id, imageUrl, country, value, year, currency);
    }

    public static void show(String country){
        System.out.println("Test" + country);
    }
}
