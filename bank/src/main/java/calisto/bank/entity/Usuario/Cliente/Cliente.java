package calisto.bank.entity.Usuario.Cliente;

import java.math.BigDecimal;

import calisto.bank.entity.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	@OneToOne

	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column(columnDefinition = "DECIMAL", precision = 5, scale = 2)
	private BigDecimal scoreCredito = BigDecimal.ZERO;
}
