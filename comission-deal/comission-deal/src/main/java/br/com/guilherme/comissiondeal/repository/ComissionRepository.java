package br.com.guilherme.comissiondeal.repository;

import br.com.guilherme.comissiondeal.model.Comission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComissionRepository extends JpaRepository<Comission, Long> {
}
