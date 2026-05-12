package jakarta.nosql.communication.graph;

public class GraphManager {

    Vertex put(Vertex vertex);

    Edge put(Edge edge);

    Optional<Vertex> findVertexById(Object id);

    Optional<Edge> findEdgeById(Object id);

    void deleteVertexById(Object id);

    void deleteEdgeById(Object id);

}
