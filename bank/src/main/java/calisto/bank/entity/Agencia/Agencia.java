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
	private int idAgencia;
	private String nome;
	private String codigoAgencia;
	private Endereco endereco;
}
