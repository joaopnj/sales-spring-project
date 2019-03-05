package joao.engineering.sales.controller;

import joao.engineering.sales.model.Client;
import joao.engineering.sales.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.clientRepository.findById(id));
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> save(@RequestBody Client client) {
        return ResponseEntity.ok(this.clientRepository.save(client));
    }

    @GetMapping(value = "/")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.clientRepository.findAll());
    }



}
