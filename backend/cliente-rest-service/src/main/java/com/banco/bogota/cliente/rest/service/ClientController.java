package com.banco.bogota.cliente.rest.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    @GetMapping
    public ResponseEntity<?> getClientInfo(
            @RequestParam("type") String type,
            @RequestParam("number") String number) {

        if (type == null || number == null || type.isEmpty() || number.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Type and number are required.");
        }

        if (!type.equalsIgnoreCase("C") && !type.equalsIgnoreCase("P")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid document type.");
        }

        if (type.equalsIgnoreCase("C") && number.equals("23445322")) {
            Client client = new Client();
            client.setFirstName("Juan");
            client.setSecondName("Carlos");
            client.setFirstSurname("Perez");
            client.setSecondSurname("Gomez");
            client.setPhone("1234567890");
            client.setAddress("Calle 123 #45-67");
            client.setCity("Bogotá");
            return ResponseEntity.ok(client);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Client not found.");
        }
    }
}
