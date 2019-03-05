package fr.arolla.scooterclient;

class User {

    private String id;
    private String rentedLocomotionId;
    private boolean isUsingALocomotion;
    private boolean isJuicingALocomotion;
    private boolean isHappy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String getRentedLocomotionId() {
        return rentedLocomotionId;
    }

    void setRentedLocomotionId(String rentedLocomotionId) {
        this.rentedLocomotionId = rentedLocomotionId;
    }

    boolean isUsingALocomotion() {
        return isUsingALocomotion;
    }

    void setUsingALocomotion(boolean usingALocomotion) {
        isUsingALocomotion = usingALocomotion;
    }

    boolean isJuicingALocomotion() {
        return isJuicingALocomotion;
    }

    void setJuicingALocomotion(boolean juicingALocomotion) {
        isJuicingALocomotion = juicingALocomotion;
    }

    boolean isHappy() {
        return isHappy;
    }

    void setHappy(boolean happy) {
        isHappy = happy;
    }
}
