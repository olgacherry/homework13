public class Car extends EngineTransport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();


    }
}
