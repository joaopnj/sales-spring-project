package joao.engineering.sales.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import joao.engineering.sales.model.Client;
import joao.engineering.sales.model.Saler;
import joao.engineering.sales.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@Api(description = "List of endpoints who privides all the methods of the clients", tags = "Methods of the clients")
public class ClientController {

    private ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Retorn the client by his id ", response = Client.class, produces = "application/json")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.clientRepository.findById(id));
    }

    @PostMapping(value = "/")
    @ApiOperation(value = "Save the client by his object ", response = Client.class, produces = "application/json")
    public ResponseEntity<?> save(@RequestBody Client client) {
        return ResponseEntity.ok(this.clientRepository.save(client));
    }

    @GetMapping(value = "/")
    @ApiOperation(value = "Find all the clients ", response = List.class, produces = "application/json")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.clientRepository.findAll());
    }

    @GetMapping(value = "/bysalerid")
    @ApiOperation(value = "Find the Client by Saler Id", response = Client.class, produces = "application/json")
    public ResponseEntity<?> findByClientId(Long salerId) {
        return ResponseEntity.ok(this.clientRepository.findBySaler(new Saler(salerId)));
    }



}
