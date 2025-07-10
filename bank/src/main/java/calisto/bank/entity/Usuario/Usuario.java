package calisto.bank.entity.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
	private int idUsuario;
	private String nome;
	private String cpf;
	private LocalDateTime dataNascimento;
	private String telefone;
	private TIpoUsuario TipoUsuario;
	private String senhaHash;
	private String otpAtivo;
	private LocalDate otpExpiracao;
}
