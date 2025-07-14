package calisto.bank.entity.Auditoria;


import calisto.bank.entity.Usuario.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

public class Auditoria {
    private int idAuditoria;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String detalhes;

}
