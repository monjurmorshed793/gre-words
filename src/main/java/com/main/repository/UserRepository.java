package com.main.repository;

import com.main.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by munna on 9/13/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long>{
    public User findByUserName(String userName);
}
