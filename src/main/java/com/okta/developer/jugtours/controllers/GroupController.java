package com.okta.developer.jugtours.controllers;

import java.net.URISyntaxException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okta.developer.jugtours.models.Group;
import com.okta.developer.jugtours.services.GroupService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/groups")
    public Collection<Group> groups() {
        return groupService.getAllGroups();
    }

    @GetMapping("/group/{id}")
    public ResponseEntity<?> getGroup(@PathVariable Long id) {
        return groupService.getGroupById(id);
    }

    @PostMapping("/group")
    public ResponseEntity<Group> createGroup(@Valid @RequestBody Group group) throws URISyntaxException {
        return groupService.createGroup(group);
    }

    @PutMapping("/group/{id}")
    public ResponseEntity<Group> updateGroup(@Valid @RequestBody Group group) {
        return groupService.updateGroup(group);
    }

    @DeleteMapping("/group/{id}")
    public ResponseEntity<?> deleteGroup(@PathVariable Long id) {
        return groupService.deleteGroup(id);
    }
}
