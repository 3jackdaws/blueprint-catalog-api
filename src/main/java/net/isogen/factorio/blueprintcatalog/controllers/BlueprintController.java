package net.isogen.factorio.blueprintcatalog.controllers;

import net.isogen.factorio.blueprintcatalog.models.Blueprint;
import net.isogen.factorio.blueprintcatalog.models.User;
import net.isogen.factorio.blueprintcatalog.repositories.BlueprintRepo;
import net.isogen.factorio.blueprintcatalog.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BlueprintController {

    @Autowired
    private BlueprintRepo blueprints;

    @Autowired
    private UserRepo users;

    @GetMapping("/api/blueprints")
    public List<Blueprint> getBlueprints(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Long user
    ){
        ExampleMatcher ciMatcher = ExampleMatcher.matchingAll().withIgnoreCase().withMatcher(
                "name", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase()
        );

        User filterByUser = null;

        if(user != null) filterByUser = users.findById(user).orElse(null);

        Example<Blueprint> example = Example.of(new Blueprint(name, null, filterByUser), ciMatcher);
        return blueprints.findAll(example);
    }

    @PostMapping("/api/blueprints")
    public Blueprint createBlueprint(@RequestBody Blueprint bp){
        User author = users.findById((long)3).orElse(null);
        bp.setAuthor(author);
        return blueprints.save(bp);
    }
}
