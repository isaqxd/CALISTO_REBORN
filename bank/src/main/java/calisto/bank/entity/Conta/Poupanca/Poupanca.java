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
    private int idContaPoupanca;
    private Conta conta;
    private BigDecimal taxaRendimento;
    private LocalDate ultimoRendimento;
}
