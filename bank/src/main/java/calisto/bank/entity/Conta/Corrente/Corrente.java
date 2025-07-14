package calisto.bank.entity.Conta.Corrente;

import calisto.bank.entity.Conta.Conta;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter

public class Corrente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCorrente;
    @OneToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;

    @Column(columnDefinition = "DECIMAL", precision = 15, scale = 2, nullable = false)
    private BigDecimal limite = BigDecimal.ZERO;

    @Column(columnDefinition = "DATE", nullable = false)
    private LocalDate dataVencimento;

    @Column(columnDefinition = "DECIMAL", precision = 5, scale = 2, nullable = false)
    private BigDecimal taxaManutencao = BigDecimal.ZERO;
}
