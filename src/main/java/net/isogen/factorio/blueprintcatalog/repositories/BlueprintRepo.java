package net.isogen.factorio.blueprintcatalog.repositories;

import net.isogen.factorio.blueprintcatalog.models.Blueprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlueprintRepo extends JpaRepository<Blueprint, Long> {
    public List<Blueprint> findByNameContains(String query);
}
