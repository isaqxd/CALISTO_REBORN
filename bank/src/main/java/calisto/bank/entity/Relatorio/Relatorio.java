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
	private LocalDateTime dataGeracao;
	private String conteudo;
}
