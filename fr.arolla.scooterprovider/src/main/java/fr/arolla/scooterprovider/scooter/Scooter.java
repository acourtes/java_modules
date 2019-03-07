package fr.arolla.scooterprovider.scooter;

import org.arolla.internal.DetailedScooter;

public class Scooter {

    private String id;
    private Provider provider;
    private State state;
    private Integer batteryPercentage;
    private boolean rented;
    private Integer distanceTraveled;

    public Scooter() {
    }

    public Scooter(String id, Provider provider, State state, Integer batteryPercentage, boolean rented, Integer distanceTraveled) {
        this.id = id;
        this.provider = provider;
        this.state = state;
        this.batteryPercentage = batteryPercentage;
        this.rented = rented;
        this.distanceTraveled = distanceTraveled;
    }

    public void setId(String id) {
        if (this instanceof DetailedScooter) {
            this.id = id;
        }
    }

    public void setProvider(Provider provider) {
        if (this instanceof DetailedScooter) {
            this.provider = provider;
        }
    }

    public void setState(State state) {
        if (this instanceof DetailedScooter) {
            this.state = state;
        }
    }

    public void setBatteryPercentage(Integer batteryPercentage) {
        if (this instanceof DetailedScooter) {
            this.batteryPercentage = batteryPercentage;
        }
    }

    public String getId() {
        return id;
    }

    public Provider getProvider() {
        return provider;
    }

    public State getState() {
        return state;
    }

    public Integer getBatteryPercentage() {
        return batteryPercentage;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public Integer getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(Integer distanceTraveled) {
        if (this instanceof DetailedScooter) {
            this.distanceTraveled = distanceTraveled;
        }
    }
}
