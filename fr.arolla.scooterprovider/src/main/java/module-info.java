module fr.arolla.scooterprovider {
    exports fr.arolla.scooterprovider;
    exports fr.arolla.scooterprovider.scooter;
    requires random.beans;

    opens fr.arolla.scooterprovider.userwallet;
}