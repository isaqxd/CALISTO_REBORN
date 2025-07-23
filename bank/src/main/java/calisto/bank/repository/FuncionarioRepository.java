package calisto.bank.repository;

import calisto.bank.entity.Usuario.Funcionario.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
