package calisto.bank.entity.Conta.Poupanca;

import calisto.bank.entity.Conta.Conta;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter

public class Poupanca {
    private int idContaPoupanca;
    private Conta conta;
    private BigDecimal taxaRendimento;
    private LocalDate ultimoRendimento;
}
