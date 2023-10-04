package edu.greenriver.sdev.exampleprogram.db;

import edu.greenriver.sdev.exampleprogram.model.WeatherReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This is a data layer that allows us to access WeatherReading records
 * in our database.
 */
@Repository
public interface iWeatherReadingRepository extends JpaRepository<WeatherReading, Integer> {

}
