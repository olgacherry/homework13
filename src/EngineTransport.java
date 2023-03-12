public abstract class EngineTransport extends Transport implements Diagnostable{

    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service() {
     checkEngine();
    }
}
