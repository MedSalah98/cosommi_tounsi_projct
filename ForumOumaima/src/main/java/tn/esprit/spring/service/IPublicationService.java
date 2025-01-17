package tn.esprit.spring.service;

import java.util.List;
import java.util.NoSuchElementException;
import tn.esprit.spring.entity.Publication;
import tn.esprit.spring.entity.RatePub;

public interface IPublicationService {
	public Publication createOrUpdate(Publication publication);
	public void delete(Long id);
	Publication getById (Long id) throws NoSuchElementException;
	List<Publication> findByUserId(Long id);
	Publication rate(Long idPublication, Long idUser, RatePub rate);
	public List<Publication> news();
}
