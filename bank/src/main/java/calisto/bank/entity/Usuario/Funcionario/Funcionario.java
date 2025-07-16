package calisto.bank.entity.Usuario.Funcionario;

import calisto.bank.entity.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFuncionario;

	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column(length = 20, unique = true, nullable = false)
	private String codigoFuncionario;

	@Enumerated(EnumType.STRING)
	@Column(name = "cargo", nullable = false)
	private Cargo cargo;

	@ManyToOne
	@JoinColumn(name = "supervisor")
	private Funcionario iSupervisor;
}
