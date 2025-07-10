package calisto.bank.entity.Usuario.Cliente;

import java.math.BigDecimal;

import calisto.bank.entity.Usuario.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	private int idCliente;
	private Usuario usuario;
	private BigDecimal scoreCredito;
}
