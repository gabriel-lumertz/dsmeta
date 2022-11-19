package dev.lumertz.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.lumertz.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
