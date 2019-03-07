package fr.arolla.scooterclient;

import java.math.BigDecimal;

class User {

    private String id;
    private String rentedLocomotionId;
    private boolean isUsingALocomotion;
    private boolean isJuicingALocomotion;
    private boolean isHappy;
    private BigDecimal creditAmount;

    String getId() {
        return id;
    }

    void setId(String id) {
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

    BigDecimal getCreditAmount() {
        return creditAmount;
    }

    void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }
}
