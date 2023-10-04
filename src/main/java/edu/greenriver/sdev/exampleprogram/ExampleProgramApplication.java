package edu.greenriver.sdev.exampleprogram;


import edu.greenriver.sdev.exampleprogram.db.iWeatherReadingRepository;
import edu.greenriver.sdev.exampleprogram.model.WeatherReading;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ExampleProgramApplication {

	public static void main(String[] args)
	{
		// get access to the spring container (aka the application context)
		ApplicationContext context = SpringApplication.run(ExampleProgramApplication.class, args);

		// ask the spring container for our data layer (a spring bean)
		iWeatherReadingRepository repo = context.getBean(iWeatherReadingRepository.class);

		// records to add to our db
		List<WeatherReading> readings = List.of(
			new WeatherReading("10/10/23 9 p.m.", "Lakewood", "Rainy", 70.0),
			new WeatherReading("10/11/23 9 p.m.", "Olympia", "Foggy", 52.0),
			new WeatherReading("10/12/23 7 p.m.", "Tacoma", "Sunny", 61.0),
			new WeatherReading("10/13/23 6 p.m.", "South Tacoma", "Cloudy", 65.0)

		);

		for (WeatherReading reading : readings) {
			repo.save(reading);
		}
	}

}
