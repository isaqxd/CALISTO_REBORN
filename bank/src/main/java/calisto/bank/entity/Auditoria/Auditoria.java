package calisto.bank.entity.Auditoria;


import calisto.bank.entity.Usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class Auditoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAuditoria;

    @OneToOne
    @JoinColumn(name = "id_usuario") // RENOMEIA A TABELA PARA (id_usuario)
    private Usuario usuario;

    @Column(length = 50, nullable = false)
    private String acao;

    @Column(name = "data_hora", columnDefinition = "TIMESTAMP", nullable = false) // NOTAÇÃO PARA CRIAR UM TIMESTAMP
    private LocalDateTime dataHora;

    @Column(columnDefinition = "TEXT") // CONVERTE O CAMPO PARA TEXT
    private String detalhes;

}
