package joao.engineering.sales.controller;

import joao.engineering.sales.model.Saler;
import joao.engineering.sales.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saler")
public class SalerController {

    private SalesRepository salesRepository;

    @Autowired
    public SalerController(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.salesRepository.findById(id));
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> save(@RequestBody Saler saler) {
        return ResponseEntity.ok(this.salesRepository.save(saler));
    }

    @GetMapping(value = "/")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(this.salesRepository.findAll());
    }



}
