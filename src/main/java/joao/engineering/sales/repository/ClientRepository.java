package joao.engineering.sales.repository;

import joao.engineering.sales.model.Client;
import joao.engineering.sales.model.Saler;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findBySaler(Saler saler);
}
