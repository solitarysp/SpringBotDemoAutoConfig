package com.lethanh98.spring.bot.demo.autoconfig.repo;

import com.lethanh98.spring.bot.demo.autoconfig.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
