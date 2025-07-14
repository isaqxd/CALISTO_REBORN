package calisto.bank.entity.Transacao;

import calisto.bank.entity.Conta.Conta;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter

public class Transacao {
    private int idTransacao;
    private Conta contaOrigem;
    private Conta contaDestino;
    private Tipo tipo;
    private BigDecimal valor;
    private LocalDateTime dataHora;
    private String descricao;
}
