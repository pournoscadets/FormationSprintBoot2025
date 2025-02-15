package formation.afiuna.springboot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TransactionController {

    @PostMapping(value = "/transfert", consumes = "application/json")
    public ResponseEntity<?> transfert() {
        return null;
    }

    @GetMapping(value = "/amount/{id}", produces = "application/json")
    public ResponseEntity<?> getAmount(@PathVariable("id") Integer id) {
        return ResponseEntity.ok("OK");
    }

}
