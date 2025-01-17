package tn.esprit.spring.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Publication;

@Repository
public interface IPublicationRepository extends JpaRepository<Publication, Long>{

	Optional <List<Publication>> findByUserId(Long id);
	List<Publication> findFirst5ByOrderByDatePublicationDesc();
}
