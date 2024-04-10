package org.web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.web.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
