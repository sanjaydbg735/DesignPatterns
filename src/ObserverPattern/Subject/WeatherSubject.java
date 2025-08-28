package ObserverPattern.Subject;

import ObserverPattern.Observers.Observer;

public interface WeatherSubject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
