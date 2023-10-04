package edu.greenriver.sdev.exampleprogram.services;

import edu.greenriver.sdev.exampleprogram.db.iWeatherReadingRepository;
import edu.greenriver.sdev.exampleprogram.model.WeatherReading;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    // this is a spring bean, I can also use dependency injection here
    private iWeatherReadingRepository repo;

    public WeatherService(iWeatherReadingRepository repo) {
        this.repo = repo;
    }

    public List<WeatherReading> getAllReadings()
    {
        return repo.findAll();
    }

    public List<Double> getAllTemps()
    {
        // give me all of the db records
        List<WeatherReading> readings = repo.findAll();
        List<Double> temps = new ArrayList<>();

        for (WeatherReading reading : readings) {
            temps.add(reading.getTempFaren());
        }
        return temps;
    }

}
