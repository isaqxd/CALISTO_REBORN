package calisto.bank.entity.Usuario.Funcionario;

import calisto.bank.entity.Usuario.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario {
	private int idFuncionario;
	private Usuario usuario;
	private String codigoFuncionario;
	private Cargo cargo;
	private int idSupervisor;
}
