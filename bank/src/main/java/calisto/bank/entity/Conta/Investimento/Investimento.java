package calisto.bank.entity.Conta.Investimento;

import calisto.bank.entity.Conta.Conta;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter

public class Investimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContaInvestimento;
    @OneToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Risco risco;

    @Column(columnDefinition = "DECIMAL", precision = 15, scale = 2, nullable = false)
    private BigDecimal minimo;

    @Column(columnDefinition = "DECIMAL", precision = 5, scale = 2, nullable = false)
    private BigDecimal taxaRendimentos;
}
