public class EngineAdapter implements Driveable {

    private Engine engine;

    public EngineAdapter(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.startEngine();
        engine.accelerateEngine();
        engine.startEngine();
    }
}
