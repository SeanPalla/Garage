package Vehicle.Parts;

import java.util.Objects;

public class Engine {

    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;

    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Engine)) {
            return false;
        }
        Engine engine = (Engine) o;
        return Objects.equals(engineType, engine.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(engineType);
    }

    @Override
    public String toString() {
        return "{" +
                " engineType='" + getEngineType() + "'" +
                "}";
    }

}
