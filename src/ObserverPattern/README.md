Subject `Interface`
* registerObserver();
* removeObserver();
* notifyObserver();

Observer `Interface`
* update();

DisplayElement `Interface`
* display();
------------
WeatherData `Class`
* registerObserver();
* removeObserver();
* notifyObserver();
* getTemperature();
* getHumidity();
* getPressure();
* measurementChange();

CurrentConditionDisplay `Class: extend to Observer and Display`
* update(); `update only required data`
* display(); `current value of temp, press, and humidity`

StatisticDisplay `Class`
* update(); `update only required data`
* display; `display avg value of temp, press, and humidity`

ForecastDisplay `Class`
* update(); `update only required data`
* display(); `display forecast value of temp, press, and humidity`

ThirdPartyDisplay `Class`
* update();
* display();

