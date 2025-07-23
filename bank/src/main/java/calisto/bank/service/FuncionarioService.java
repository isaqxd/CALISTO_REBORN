package calisto.bank.service;

import calisto.bank.entity.Usuario.Funcionario.Funcionario;
import calisto.bank.entity.Usuario.Usuario;
import calisto.bank.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public String save(Funcionario funcionario) {
        this.funcionarioRepository.save(funcionario);
        return "Cliente salvo com sucesso!";
    }

    public String update(Funcionario funcionario, long id) {
        Funcionario funcionarioBase = findById(id);

        funcionarioBase.setCodigoFuncionario(funcionario.getCodigoFuncionario());
        funcionarioBase.setCargo(funcionario.getCargo());
        funcionarioBase.setSupervisor(funcionario.getSupervisor());

        Usuario usuarioInput = funcionario.getUsuario();
        Usuario usuarioOriginal = funcionarioBase.getUsuario();

        usuarioOriginal.setNome(usuarioInput.getNome());
        usuarioOriginal.setTelefone(usuarioInput.getTelefone());
        usuarioOriginal.setDataNascimento(usuarioInput.getDataNascimento());

        this.funcionarioRepository.save(funcionario);
        return "Cliente foi atualizado com sucesso!";
    }

    public String delete(long id) {
        this.funcionarioRepository.deleteById(id);
        return "Cliente deletado com sucesso!";
    }

    public List<Funcionario> findAll() {
        return this.funcionarioRepository.findAll();
    }

    public Funcionario findById(long id) {
        return this.funcionarioRepository.findById(id).get();
    }
}
