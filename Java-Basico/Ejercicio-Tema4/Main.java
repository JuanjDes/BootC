package poo.javabasico.tema4;

public class Main {

    public static void main(String[] args) {

        SmartDevice device = new SmartDevice();
        SmartPhone devicePhone = new SmartPhone();
        SmartWatch deviceWatch = new SmartWatch();

        // Datos para SmartDevice
        device.identifier = "0002";
        device.releaseDate = "2020-12-17";
        device.operatingSystem = "Android";

        // Datos para SmartPhone
        devicePhone.deviceName = "Galaxy A72";
        devicePhone.screenSize = "6.1'";
        devicePhone.screenResolution = "800 x 480";
        devicePhone.mainCamera = "12 Mpx";
        devicePhone.frontCamera = "5 Mpx";
        devicePhone.ram = "4 Gb";
        devicePhone.battery = "5000 mAh";

        // Datos para SmartWatch
        deviceWatch.deviceName = "Watch T61";
        deviceWatch.screenSize = "3'";
        deviceWatch.screenResolution = "300x200";
        deviceWatch.battery = "250mAh";
        deviceWatch.brazaleteType = "Goma";
        deviceWatch.compatibilityMobile = false;

        // Muestro datos de SmartPhone o SmartWatch dependiendo de identifier
        if(device.identifier == "0001") {
            System.out.println("Referencia:        " + device.identifier);
            System.out.println("Fecha lanzamiento: " + device.releaseDate);
            System.out.println("Sistema operativo: " + device.operatingSystem);
            System.out.println("Nombre:            " + devicePhone.deviceName);
            System.out.println("Pantalla:          " + devicePhone.screenSize);
            System.out.println("Resolucion:        " + devicePhone.screenResolution);
            System.out.println("Camara principal:  " + devicePhone.mainCamera);
            System.out.println("Front camera:      " + devicePhone.frontCamera);
            System.out.println("Memoria Ram:       " + devicePhone.ram);
            System.out.println("Bateria:           " + devicePhone.battery);
        } else {
            System.out.println("Referencia:        " + device.identifier);
            System.out.println("Fecha lanzamiento: " + device.releaseDate);
            System.out.println("Sistema operativo: " + device.operatingSystem);
            System.out.println("Nombre:            " + deviceWatch.deviceName);
            System.out.println("Pantalla:          " + deviceWatch.screenSize);
            System.out.println("Resolucion:        " + deviceWatch.screenResolution);
            System.out.println("Bateria:           " + deviceWatch.battery);
            System.out.println("Brazalete:         " + deviceWatch.brazaleteType);
            System.out.println("Compatib. movil:   " + deviceWatch.compatibilityMobile);
        }
    }
}


