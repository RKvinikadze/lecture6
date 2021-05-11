package ge.tsu.spring.lecture6.weather.impl;

import ge.tsu.spring.lecture6.db.Tables;
import ge.tsu.spring.lecture6.weather.AddWeather;
import ge.tsu.spring.lecture6.weather.WeatherService;
import ge.tsu.spring.lecture6.weather.WeatherView;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    DSLContext dslContext;

    @Override
    public List<WeatherView> getAll() {
        return dslContext.selectFrom(Tables.WEATHER)
                .fetch()
                .into(WeatherView.class);
    }

    @Override
    public WeatherView getById(int id) {
        return dslContext.selectFrom(Tables.WEATHER)
                .where(Tables.WEATHER.ID.equal(id))
                .fetchOne()
                .into(WeatherView.class);
    }

    @Override
    public void add(AddWeather addWeather) {
        dslContext.insertInto(Tables.WEATHER,
                Tables.WEATHER.COUNTRY,
                Tables.WEATHER.CITY,
                Tables.WEATHER.TEMPERATURE)
                .values(addWeather.getCountry(),
                        addWeather.getCity(),
                        addWeather.getTemperature())
                .execute();
    }

    @Override
    public void update(AddWeather addWeather, int id) {
        dslContext.update(Tables.WEATHER)
                .set(Tables.WEATHER.COUNTRY, addWeather.getCountry())
                .set(Tables.WEATHER.CITY, addWeather.getCity())
                .set(Tables.WEATHER.TEMPERATURE, addWeather.getTemperature())
                .where(Tables.WEATHER.ID.equal(id))
                .execute();
    }

    @Override
    public void delete(int id) {
        dslContext.delete(Tables.WEATHER)
                .where(Tables.WEATHER.ID.equal(id))
                .execute();
    }
}
