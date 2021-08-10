package br.com.guilherme.comissiondeal.repository;

import br.com.guilherme.comissiondeal.model.ComissionUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComissionUserRepository extends JpaRepository<ComissionUser, Long> {
}
