package edu.greenriver.sdev.exampleprogram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class WeatherReading {

    private String dateTime;
    private String location;
    private String condition;

    private double tempFaren;

}
