package com.uw.clientMigration.controller;

import com.uw.clientMigration.entity.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 12/31/25
 */


@RestController
@RequestMapping("/api")
public class MigrationController {


    Map<Integer, Client> legacy = new HashMap<>() {{
        put(1, new Client("John", "active"));
        put(2, new Client("Jane Smith", "active"));
        put(3, new Client("ABC Corp", "active"));
        put(4, new Client("XYZ Ltd", "active"));
        put(5, new Client("Mike Johnson", "active"));
    }};



    Map<Integer, Client> newClient = new HashMap<>();

    @GetMapping("/legacy")
    public ResponseEntity<?> getLegacyClient() {
        return ResponseEntity.ok(legacy);
    }


    @PostMapping("/migrate")
    public ResponseEntity<?> migrate(@RequestParam int id) {
        newClient.put(id, legacy.get(id));
        legacy.get(id).setStatus("migrated");
        return ResponseEntity.ok(legacy.get(id));
    }

    @GetMapping("/new")
    public ResponseEntity<?> getNewClient() {
        return ResponseEntity.ok(newClient);
    }

}
