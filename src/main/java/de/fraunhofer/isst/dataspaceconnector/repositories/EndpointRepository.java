package de.fraunhofer.isst.dataspaceconnector.repositories;

import de.fraunhofer.isst.dataspaceconnector.model.Endpoint;
import de.fraunhofer.isst.dataspaceconnector.model.EndpointId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * The repository containing all objects of type {@link Endpoint}.
 */
@Repository
public interface EndpointRepository extends JpaRepository<Endpoint, EndpointId> {

    /**
     * Get all ids.
     * @return The ids of all entities.
     */
    @Query("select t.id from #{#entityName} t")
    Set<EndpointId> getAllIds();
}
