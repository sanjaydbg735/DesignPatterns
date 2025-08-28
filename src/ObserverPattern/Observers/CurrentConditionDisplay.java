package ObserverPattern.Observers;

import ObserverPattern.Subject.WeatherData;

public class CurrentConditionDisplay implements Observer, WeatherDisplay {
    private float temperature;
    private float humidity;
    private float pressure;
    WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
    }
    @Override
    public void display() {
        System.out.println("Current Condition Display\n" + "Temperature: " + temperature + "\nHumidity: " + humidity + "\nPressure: " + pressure);
    }
}
