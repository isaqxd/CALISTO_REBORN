package calisto.bank.entity.Agencia;

import calisto.bank.entity.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Agencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgencia;

	@Column(length = 50, nullable = false)
	private String nome;

	@Column(length = 10, nullable = false, unique = true)
	private String codigoAgencia;

	@OneToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco;
}
