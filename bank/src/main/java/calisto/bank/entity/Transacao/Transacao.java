package calisto.bank.entity.Transacao;

import calisto.bank.entity.Conta.Conta;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTransacao;
    @OneToOne
    @JoinColumn(name = "id_conta_origem")
    private Conta contaOrigem;

    @OneToOne
    @JoinColumn(name = "id_conta_destino")
    private Conta contaDestino;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @Column(columnDefinition = "DECIMAL", precision = 15, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime dataHora = LocalDateTime.now();

    @Column(length = 100)
    private String descricao;
}
