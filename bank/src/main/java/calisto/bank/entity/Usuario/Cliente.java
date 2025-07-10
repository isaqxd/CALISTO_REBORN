package calisto.bank.entity.Usuario;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	
	private int idCliente;
	private Usuario usuario;
	private BigDecimal scoreCredito;
}
