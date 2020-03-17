package pojo;

import java.util.Objects;

public class Coin {
    private long id;
    private String imageUrl;
    private String country;
    private int value;
    private short year;
    private String currency;

    public Coin (long id,
                 String imageUrl,
                 String country,
                 int value,
                 short year,
                 String currency){
        this.id = id;
        this.imageUrl = imageUrl;
        this.country = country;
        this.value = value;
        this.year = year;
        this.currency = currency;
    }

    public long getId(){
        return id;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public String getCountry(){
        return country;
    }

    public int getValue(){
        return value;
    }

    public short getYear(){
        return year;
    }

    public  String getCurrency(){
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (id != coin.id) return false;
        if (value != coin.value) return false;
        if (year != coin.year) return false;
        if (!Objects.equals(imageUrl, coin.imageUrl)) return false;
        if (!country.equals(coin.country)) return false;
        return currency.equals(coin.currency);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + country.hashCode();
        result = 31 * result + value;
        result = 31 * result + (int) year;
        result = 31 * result + currency.hashCode();
        return result;
    }
}
