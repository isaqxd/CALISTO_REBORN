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
	private int idEndereco;
	private Usuario usuario;
	private String cep;
	private String local;
	private int numeroCasa;
	private String bairro;
	private String cidade;
	private char estado;
	private String complemento;
}
