package ge.tsu.spring.lecture6.weather;

public class AddWeather {
    private String country;
    private String city;
    private int temperature;

    public AddWeather(String country, String city, int temperature) {
        this.country = country;
        this.city = city;
        this.temperature = temperature;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
