package calisto.bank.entity.Relatorio;

import java.time.LocalDateTime;

import calisto.bank.entity.Usuario.Funcionario.Funcionario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Relatorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRelatorio;

	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionario;

	@Column(length = 50, nullable = false)
	private String tipoRelatorio;

	@Column(columnDefinition = "TIMESTAMP", nullable = false)
	private LocalDateTime dataGeracao = LocalDateTime.now();

	@Column(columnDefinition = "TEXT", nullable = false)
	private String conteudo;
}
