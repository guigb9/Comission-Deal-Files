package br.com.guilherme.comissiondeal.repository;

import br.com.guilherme.comissiondeal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
