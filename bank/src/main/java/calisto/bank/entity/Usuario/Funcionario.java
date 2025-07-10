package calisto.bank.entity.Usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {
	private int idFuncionario;
	private Usuario usuario;
	private String codigoFuncionario;
	private int idSupervisor;
}
