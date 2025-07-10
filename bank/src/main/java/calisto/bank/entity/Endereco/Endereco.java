package calisto.bank.entity.Endereco;

import calisto.bank.entity.Usuario.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {
	private int idEndereco;
	private Usuario usuario;
	private String cep;
	private String local;
	private int numeroCasa;
	private String bairro;
	private String cidade;
	private char estado;
	
}
