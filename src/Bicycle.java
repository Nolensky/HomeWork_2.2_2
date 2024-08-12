public class Bicycle extends TransportVehicle{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(TransportVehicle transportVehicle) {
        System.out.println("Обслуживаем " + transportVehicle.getModelName());
        for (int i = 0; i < transportVehicle.getWheelsCount(); i++) {
            int numberWheel = i;
            updateTyre();
            System.out.println(" №" + (++numberWheel));
        }
    }

    public void updateTyre() {
        System.out.print("Меняем покрышку");
    }
}
