package ObserverPattern;

import ObserverPattern.Observers.CurrentConditionDisplay;
import ObserverPattern.Observers.Observer;
import ObserverPattern.Observers.StatisticDisplay;
import ObserverPattern.Subject.WeatherData;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 30);
        currentConditionDisplay.display();
        statisticDisplay.display();

        weatherData.setMeasurements(90, 60, 30);
        currentConditionDisplay.display();
        statisticDisplay.display();

//        weatherData.removeObserver(statisticDisplay);
//        weatherData.removeObserver(currentConditionDisplay);

        weatherData.setMeasurements(70, 80, 40);
        currentConditionDisplay.display();
        statisticDisplay.display();


    }
}
