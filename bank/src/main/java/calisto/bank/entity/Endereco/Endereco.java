package calisto.bank.entity.Endereco;

import calisto.bank.entity.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEndereco;

	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column(length = 10, nullable = false)
	private String cep;

	@Column(length = 100, nullable = false)
	private String local;

	@Column(nullable = false)
	private int numeroCasa;

	@Column(length = 50, nullable = false)
	private String bairro;

	@Column(length = 50, nullable = false)
	private String cidade;

	@Column(length = 2, nullable = false)
	private char estado;

	@Column(length = 50)
	private String complemento;
}
