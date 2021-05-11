package ge.tsu.spring.lecture6.weather;

import java.util.List;

public interface WeatherService {
    List<WeatherView> getAll();
    WeatherView getById(int id);
    void add(AddWeather addWeather);
    void update(AddWeather addWeather, int id);
    void delete(int id);
}
