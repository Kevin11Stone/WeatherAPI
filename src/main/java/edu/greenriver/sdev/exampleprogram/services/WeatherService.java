package edu.greenriver.sdev.exampleprogram.services;

import edu.greenriver.sdev.exampleprogram.model.WeatherReading;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    public List<WeatherReading> getAllReadings()
    {
        return List.of(
                new WeatherReading("10/10/23 9 p.m.", "Lakewood", "Rainy", 70.0),
                new WeatherReading("10/11/23 9 p.m.", "Olympia", "Foggy", 52.0),
                new WeatherReading("10/12/23 7 p.m.", "Tacoma", "Sunny", 61.0),
                new WeatherReading("10/13/23 6 p.m.", "South Tacoma", "Cloudy", 65.0)

        );
    }

    public List<Double> getAllTemps()
    {
        return List.of(
                70.0, 24.8, 66.8, 68.0
        );
    }


}
