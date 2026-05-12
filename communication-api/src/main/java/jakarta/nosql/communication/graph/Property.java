package jakarta.nosql.communication.graph;

public interface Property {

    String name();

    <T> T value();

}