package calisto.bank.entity.Auditoria;


import calisto.bank.entity.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAuditoria;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String detalhes;

}
