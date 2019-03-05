package fr.arolla.scooterclient;

//import org.arolla.internal.DetailedScooter;
//import org.arolla.internal.Power;
import fr.arolla.scooterprovider.ScooterProvider;
import fr.arolla.scooterprovider.scooter.Scooter;

class ScooterRentalClient {

    private ScooterProvider scooterProvider;

    ScooterRentalClient(ScooterProvider scooterProvider) {
        this.scooterProvider = scooterProvider;
    }

    boolean rentAScooter(User user, Scooter scooter) {
        final boolean rentalSuccess = scooterProvider.rentAScooter(scooter);

        if (!rentalSuccess) {
            user.setHappy(false);
            return false;
        }

        user.setHappy(true);
        user.setRentedLocomotionId(scooter.getId());
        user.setUsingALocomotion(true);
        return true;
    }

    boolean giveBackAScooter(User user, Scooter scooter) {
        final boolean giveBackSuccess = scooterProvider.giveBackAScooter(scooter);

        if (!giveBackSuccess) {
            user.setHappy(false);
            return false;
        }

        user.setUsingALocomotion(false);
        user.setRentedLocomotionId(null);
        user.setHappy(true);

        return true;
    }

    boolean juiceAScooter(User user, Scooter scooter) {
        final boolean juiceSuccessful = scooterProvider.juiceAScooter(scooter);

        if (!juiceSuccessful) {
            user.setHappy(false);
            return false;
        }

        user.setRentedLocomotionId(scooter.getId());
        user.setJuicingALocomotion(true);
        user.setHappy(true);

        return true;
    }

    // This method is no more possible as we have restrict the internal package access from provider

    // The provider JAR is not well protected and we can tweak the scooter without their permission :)
//    DetailedScooter pimpMyScooter(Scooter scooter, Power newPower, Integer newMileage) {
//        final DetailedScooter detailedScooter = new DetailedScooter(scooter);
//
//        detailedScooter.setPower(newPower);
//        detailedScooter.setMileage(newMileage);
//
//        return detailedScooter;
//    }
}
