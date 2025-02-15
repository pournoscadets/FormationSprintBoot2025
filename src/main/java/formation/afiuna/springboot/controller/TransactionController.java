package formation.afiuna.springboot.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionController {

    @PostMapping("/transfert")
    public ResponseEntity<?> transfert() {
        return null;
    }

    @GetMapping("/amount/{id}")
    public ResponseEntity<?> getAmount(@PathVariable("id") Integer id) {
        return ResponseEntity.ok("OK");
    }

}
