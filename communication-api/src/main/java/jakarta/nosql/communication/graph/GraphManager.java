package jakarta.nosql.communication.graph;

import java.util.Optional;

public interface GraphManager {

    Vertex put(Vertex vertex);

    Edge put(Edge edge);

    Optional<Vertex> findVertexById(Object id);

    Optional<Edge> findEdgeById(Object id);

    void deleteVertexById(Object id);

    void deleteEdgeById(Object id);

}
