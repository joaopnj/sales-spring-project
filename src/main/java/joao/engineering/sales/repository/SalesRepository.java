package joao.engineering.sales.repository;

import joao.engineering.sales.model.Saler;
import org.springframework.data.repository.CrudRepository;

public interface SalesRepository extends CrudRepository<Saler, Long> {
}
