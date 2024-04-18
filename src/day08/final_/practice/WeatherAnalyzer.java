package day08.final_.practice;

import static day08.final_.practice.WeatherConstants.*;

public class WeatherAnalyzer {
    public static boolean checkTemperatureAlert(double temperature) {
        if(temperature > MAX_TEMPERATURE_ALERT.getNumericData() || temperature < MIN_TEMPERATURE_ALERT.getNumericData()) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkPrecipitationAlert(double precipitation) {
        if(precipitation > PRECIPITATION_ALERT.getNumericData()) {
            return true;
        } else {
            return false;
        }
    }
}
