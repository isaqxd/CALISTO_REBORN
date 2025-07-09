package calisto.bank.entity.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
	public int idUsuario;
	public String nome;
	public String cpf;
	public LocalDateTime dataNascimento;
	public String telefone;
	public TIpoUsuario TipoUsuario;
	public String senhaHash;
	public String otpAtivo;
	public LocalDate otpExpiracao;
}
