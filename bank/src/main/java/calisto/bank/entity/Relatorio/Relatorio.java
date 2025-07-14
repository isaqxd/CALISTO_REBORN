package calisto.bank.entity.Relatorio;

import java.time.LocalDateTime;

import calisto.bank.entity.Usuario.Funcionario.Funcionario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relatorio {
	private int idRelatorio;
	private Funcionario funcionario;
	private String tipoRelatorio;

	@Column(columnDefinition = "TIMESTAMP", nullable = false)
	private LocalDateTime dataGeracao = LocalDateTime.now();

	@Column(columnDefinition = "TEXT", nullable = false)
	private String conteudo;
}
