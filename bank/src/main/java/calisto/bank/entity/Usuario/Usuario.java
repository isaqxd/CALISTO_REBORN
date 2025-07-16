package calisto.bank.entity.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@Column(length = 100, nullable = false)
	private String nome;

	@Column(length = 11, nullable = false, unique = true)
	private String cpf;

	@Column(columnDefinition = "DATE", nullable = false)
	private LocalDate dataNascimento;

	@Column(length = 15, nullable = false)
	private String telefone;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TIpoUsuario TipoUsuario;

	@Column(length = 64, nullable = false)
	private String senhaHash;

	@Column(length = 6)
	private String otpAtivo;

	@Column(columnDefinition = "DATETIME")
	private LocalDateTime otpExpiracao;
}
