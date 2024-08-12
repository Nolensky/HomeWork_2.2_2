public class Truck extends TransportVehicle implements VehicleWithEngine,VehicleWithTrailer{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.print("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у " + getModelName());
    }

    @Override
    public void check(TransportVehicle transportVehicle){
        System.out.println("Обслуживаем " + transportVehicle.getModelName());
        for (int i = 0; i < transportVehicle.getWheelsCount(); i++) {
            int numberWheel = i;
            updateTyre();
            System.out.println(" №" + (++numberWheel));
        }
        checkEngine();
        checkTrailer();
    }
}
