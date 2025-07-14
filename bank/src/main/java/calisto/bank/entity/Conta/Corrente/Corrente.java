package calisto.bank.entity.Conta.Corrente;

import calisto.bank.entity.Conta.Conta;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Corrente {
    private int idCorrente;
    private Conta conta;
    private BigDecimal limite;
    private LocalDate dataVencimento;
    private BigDecimal taxaManutencao;
}
