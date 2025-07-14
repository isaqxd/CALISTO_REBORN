package calisto.bank.entity.Conta.Investimento;

import calisto.bank.entity.Conta.Conta;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class Investimento {
    private int idContaInvestimento;
    private Conta conta;
    private Risco risco;
    private BigDecimal minimo;
    private BigDecimal taxaRendimentos;
}
