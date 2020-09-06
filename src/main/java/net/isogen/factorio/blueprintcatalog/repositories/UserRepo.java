package net.isogen.factorio.blueprintcatalog.repositories;

import net.isogen.factorio.blueprintcatalog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
