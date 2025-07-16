package calisto.bank.entity.Conta.Poupanca;

import calisto.bank.entity.Conta.Conta;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter

public class Poupanca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContaPoupanca;

    @OneToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;

    @Column(columnDefinition = "DECIMAL", precision = 5, scale = 2, nullable = false)
    private BigDecimal taxaRendimento;

    @Column(columnDefinition = "DATETIME")
    private LocalDate ultimoRendimento;
}
