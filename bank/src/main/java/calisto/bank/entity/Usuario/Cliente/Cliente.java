package calisto.bank.entity.Usuario.Cliente;

import calisto.bank.entity.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@Column(columnDefinition = "DECIMAL", precision = 5, scale = 2)
	private BigDecimal scoreCredito = BigDecimal.ZERO;
}
