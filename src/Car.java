public class Car extends TransportVehicle implements VehicleWithEngine{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.print("Меняем покрышку");
    }

    @Override
    public void checkEngine(){
        System.out.println("Проверяем двигатель у " + getModelName());
    }

    public  void check(TransportVehicle transportVehicle){
        System.out.println("Обслуживаем " + transportVehicle.getModelName());
        for (int i = 0; i < transportVehicle.getWheelsCount(); i++) {
            int numberWheel = i;
            updateTyre();
            System.out.println(" №" + (++numberWheel));

        }
        checkEngine();
    }
}
