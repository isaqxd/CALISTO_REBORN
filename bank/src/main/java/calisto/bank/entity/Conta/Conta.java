package calisto.bank.entity.Conta;

import calisto.bank.entity.Agencia.Agencia;
import calisto.bank.entity.Usuario.Cliente.Cliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter

public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConta;
    private String numeroConta;
    private Agencia agencia;
    private BigDecimal saldo;
    private TipoConta tipoConta;
    private Cliente cliente;
    private LocalDate dataAbertura;
    private Status status;
}
