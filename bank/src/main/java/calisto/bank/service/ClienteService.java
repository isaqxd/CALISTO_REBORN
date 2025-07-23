package calisto.bank.service;

import calisto.bank.entity.Usuario.Cliente.Cliente;
import calisto.bank.entity.Usuario.Usuario;
import calisto.bank.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public String save(Cliente cliente) {
        this.clienteRepository.save(cliente);
        return "Cliente salvo com sucesso!";
    }

    public String update(Cliente cliente, long id) {
        Cliente clienteBase = findById(id);

        clienteBase.setScoreCredito(cliente.getScoreCredito());

        Usuario usuarioInput = cliente.getUsuario();
        Usuario usuarioOriginal = clienteBase.getUsuario();

        usuarioOriginal.setNome(usuarioInput.getNome());
        usuarioOriginal.setTelefone(usuarioInput.getTelefone());
        usuarioOriginal.setDataNascimento(usuarioInput.getDataNascimento());


        clienteRepository.save(clienteBase);
        return "Cliente atualizado com sucesso!";
    }

    public String delete(long id) {
        this.clienteRepository.deleteById(id);
        return "Cliente deletado com sucesso!";
    }

    public List<Cliente> findAll(){
        return this.clienteRepository.findAll();
    }

    public Cliente findById(long id){
        return this.clienteRepository.findById(id).get();
    }
}
