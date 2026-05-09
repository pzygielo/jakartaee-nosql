package jakarta.nosql.communication.column;

public interface Column {

    String name();

    <T> T value();

}