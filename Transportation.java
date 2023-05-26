public class Transportation {
	
	public static void main(String[] args) {
        ToyotaVIOS toyotaVIOS = new ToyotaVIOS("Radial");
        toyotaVIOS.speed = 100;
        toyotaVIOS.color = "Red";
        toyotaVIOS.price = 20000;
        toyotaVIOS.drive();
        toyotaVIOS.stop();

        U2SpyPlane u2SpyPlane = new U2SpyPlane(80.5);
        u2SpyPlane.speed = 500;
        u2SpyPlane.color = "Black";
        u2SpyPlane.price = 5000000;
        u2SpyPlane.fly();
        u2SpyPlane.stop();

        FandagoYacht fandagoYacht = new FandagoYacht("White");
        fandagoYacht.speed = 20;
        fandagoYacht.color = "Blue";
        fandagoYacht.price = 1000000;
        fandagoYacht.floatOnWater();
        fandagoYacht.stop();
    }
}