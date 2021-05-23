package br.com.pagian.clientslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pagian.clientslist.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
