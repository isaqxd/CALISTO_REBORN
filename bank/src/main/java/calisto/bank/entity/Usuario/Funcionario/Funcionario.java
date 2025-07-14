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

	@Enumerated(EnumType.STRING)
	@Column(name = "id_cargo", nullable = false)
	private Cargo cargo;

	@OneToOne
	@JoinColumn(name = "id_supervisor")
	private Funcionario idSupervisor;
}
