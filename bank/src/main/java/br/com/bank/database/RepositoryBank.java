package br.com.bank.database;

import br.com.bank.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryBank extends JpaRepository<Register, Long> {

}