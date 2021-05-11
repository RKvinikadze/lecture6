package ge.tsu.spring.lecture6.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/api/weathers")
    public List<WeatherView> getWeathers(){
        return weatherService.getAll();
    }

    @GetMapping("/api/weathers/{weatherId}")
    public WeatherView getWeatherById(@PathVariable int weatherId){
        return weatherService.getById(weatherId);
    }

    @PostMapping("/api/weathers")
    public void addWeather(@RequestBody AddWeather addWeather){
        weatherService.add(addWeather);
    }

    @PutMapping("/api/weathers/{weatherId}")
    public void updateWeather(@PathVariable int weatherId, @RequestBody AddWeather addWeather){
        weatherService.update(addWeather, weatherId);
    }

    @DeleteMapping("/api/weathers/{weatherId}")
    public void deleteWeather(@PathVariable int weatherId){
        weatherService.delete(weatherId);
    }
}
