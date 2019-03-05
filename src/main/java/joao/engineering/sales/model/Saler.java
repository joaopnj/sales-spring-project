package joao.engineering.sales.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "saler_id")
public class Saler {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "saler_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cpf")
    private String cpf;

}
