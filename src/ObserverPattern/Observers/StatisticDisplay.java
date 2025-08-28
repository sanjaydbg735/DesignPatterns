package ObserverPattern.Observers;

import ObserverPattern.Subject.WeatherData;

public class StatisticDisplay implements Observer, WeatherDisplay{
    private double temperature;
    private double humidity;
    private double pressure;
    WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        if (temperature > 0) {
            this.temperature = (temperature + weatherData.getTemperature()) / 2.0;
            this.humidity = (humidity + weatherData.getHumidity()) / 2.0;
            this.pressure = (pressure + weatherData.getPressure()) / 2.0;
        }
        else {
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
        }
    }
    @Override
    public void display() {
        System.out.println("Statistic display\n" + "Temp/Humidity/Pressure: " + temperature + "/" + humidity + "/" + pressure);
    }
}
