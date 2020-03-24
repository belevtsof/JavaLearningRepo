package pojo;

import java.net.URL;
import java.util.Objects;

public class User {
    private long id;
    private URL imageUrl;
    private String name;
    private String description;
    private String location;

    public User (long id,
                  URL  imageUrl,
                  String name,
                  String description,
                  String location){
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public long getId(){
        return id;
    }

    public URL getImageUrl(){
        return imageUrl;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getLocation(){
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!Objects.equals(imageUrl, user.imageUrl)) return false;
        if (!name.equals(user.name)) return false;
        if (!Objects.equals(description, user.description)) return false;
        return location.equals(user.location);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + name.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + location.hashCode();
        return result;
    }
}
