package calisto.bank.entity.Agencia;

import calisto.bank.entity.Endereco.Endereco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Agencia {
	private int idAgencia;
	private String nome;
	private String codigoAgencia;
	private Endereco endereco;
}
