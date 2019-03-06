package fr.arolla.scooterclient;

import lombok.Data;

@Data
class User {

    private String id;
    private String rentedLocomotionId;
    private boolean isUsingALocomotion;
    private boolean isJuicingALocomotion;
    private boolean isHappy;
}
