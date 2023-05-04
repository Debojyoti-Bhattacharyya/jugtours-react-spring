package com.okta.developer.jugtours.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.okta.developer.jugtours.models.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}
