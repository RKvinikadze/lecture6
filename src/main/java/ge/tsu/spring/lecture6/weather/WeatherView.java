package ge.tsu.spring.lecture6.weather;

public class WeatherView {
    private int id;
    private String country;
    private String city;
    private int temperature;

    public WeatherView(int id, String country, String city, int temperature) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
