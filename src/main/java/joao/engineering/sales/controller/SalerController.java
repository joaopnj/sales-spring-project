package joao.engineering.sales.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import joao.engineering.sales.model.Client;
import joao.engineering.sales.model.Saler;
import joao.engineering.sales.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saler")
@Api(description = "List of endpoints who privides all the methods of the salers", tags = "Methods of the salers")
public class SalerController {

    private SalesRepository salesRepository;

    @Autowired
    public SalerController(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Return the saler by his id ", response = Client.class, produces = "application/json")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.salesRepository.findById(id));
    }

    @PostMapping(value = "/")
    @ApiOperation(value = "Save the saler by his object ", response = Client.class, produces = "application/json")
    public ResponseEntity<?> save(@RequestBody Saler saler) {
        return ResponseEntity.ok(this.salesRepository.save(saler));
    }

    @GetMapping(value = "/")
    @ApiOperation(value = "Find all the salers", response = List.class, produces = "application/json")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.salesRepository.findAll());
    }

}
