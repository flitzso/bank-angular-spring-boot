package br.com.bank;

import java.util.List;

import br.com.bank.entity.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bank.database.RepositoryBank;

@RestController
@RequestMapping("/register")
public class RegisterREST {

    @Autowired
    private RepositoryBank repository;

    @GetMapping
    public List<Register> listar() {
        return repository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Register register) {
        repository.save(register);
    }

    @PutMapping
    public void alterar(@RequestBody Register register) {
        if (register.getId() > 0)
            repository.save(register);
    }

    @DeleteMapping
    public void excluir(Register register) {
        repository.delete(register);
    }

}