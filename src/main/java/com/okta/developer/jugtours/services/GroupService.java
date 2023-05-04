package com.okta.developer.jugtours.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.okta.developer.jugtours.models.Group;
import com.okta.developer.jugtours.repositories.GroupRepository;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public Collection<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    public ResponseEntity<?> getGroupById(Long id) {
        Optional<Group> group = groupRepository.findById(id);
        return group.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<Group> createGroup(Group group) throws URISyntaxException {
        Group result = groupRepository.save(group);
        return ResponseEntity.created(new URI("/api/group/" + result.getId())).body(result);
    }

    public ResponseEntity<Group> updateGroup(Group group) {
        Group result = groupRepository.save(group);
        return ResponseEntity.ok().body(result);
    }

    public ResponseEntity<?> deleteGroup(Long id) {
        groupRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
