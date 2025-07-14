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

    @Column(columnDefinition = "DECIMAL", precision = 15, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime dataHora = LocalDateTime.now();

    @Column(length = 100)
    private String descricao;
}
