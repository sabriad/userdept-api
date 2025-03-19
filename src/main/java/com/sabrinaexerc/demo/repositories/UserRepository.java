package com.sabrinaexerc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabrinaexerc.demo.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
