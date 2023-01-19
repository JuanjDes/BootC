package poo.javabasico.tema4;

public class SmartDevice {

    String identifier;
    String releaseDate;
    String operatingSystem;

    public SmartDevice(){
    }

    public SmartDevice(String identifier, String releaseDate, String operatingSystem) {
        this.identifier = identifier;
        this.releaseDate = releaseDate;
        this.operatingSystem = operatingSystem;
    }
}

                                // CLASES HIJA SMARTPHONE Y SMARTWATCH

class SmartPhone extends SmartDevice {

    String deviceName;
    String screenSize;
    String screenResolution;
    String mainCamera;
    String frontCamera;
    String ram;
    String battery;

    public SmartPhone () {
    }

    public SmartPhone(String deviceName, String identifier, String releaseDate, String operatingSystem, String screenSize,
                      String screenResolution, String mainCamera, String frontCamera, String ram, String battery) {

        super(identifier, releaseDate, operatingSystem);
        this.deviceName = deviceName;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
        this.mainCamera = mainCamera;
        this.frontCamera = frontCamera;
        this.ram = ram;
        this.battery = battery;
    }
}

class SmartWatch extends SmartDevice {

    String deviceName;
    String screenSize;
    String screenResolution;
    String battery;
    String brazaleteType;
    boolean compatibilityMobile;


    public SmartWatch() {

    }

    public SmartWatch(String deviceName, String identifier, String releaseDate, String operatingSystem, String screenSize,
                      String screenResolution, String battery, String brazaleteType, boolean compatibilityMobile) {
        super(identifier, releaseDate, operatingSystem);
        this.deviceName = deviceName;
        this.screenSize = screenSize;
        this.screenResolution = screenResolution;
        this.battery = battery;
        this.brazaleteType = brazaleteType;
        this.compatibilityMobile = compatibilityMobile;
    }
}