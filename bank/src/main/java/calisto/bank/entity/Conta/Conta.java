package calisto.bank.entity.Conta;

import calisto.bank.entity.Agencia.Agencia;
import calisto.bank.entity.Usuario.Cliente.Cliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;

    @Column(length = 20, nullable = false, unique = true)
    private String numeroConta;

    @OneToOne
    @JoinColumn(name = "id_agencia")
    private Agencia agencia;

    @Column(columnDefinition = "DECIMAL", precision = 15, scale = 2)
    private BigDecimal saldo = BigDecimal.ZERO; // ISSO DEFINE O DEFAULT

    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;

    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(columnDefinition = "DATETIME", nullable = false)
    private LocalDateTime dataAbertura = LocalDateTime.now(); // ISSO DEFINE O DEFAULT

    @Enumerated(EnumType.STRING)
    private Status status;
}
