package com.main.repository;

import com.main.domain.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by munna on 9/13/16.
 */
@Repository
public interface UserRolesRepository extends CrudRepository<UserRole,Long>{

    @Query("select user_roles.role from user_roles,users " +
            "where user_roles.user_id = users.user_id and user_name=?1")
    public List<String> findRoleByUserName(String userName);
}
