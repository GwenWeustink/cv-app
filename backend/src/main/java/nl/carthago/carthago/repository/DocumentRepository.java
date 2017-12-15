package nl.carthago.carthago.repository;

import nl.carthago.carthago.domain.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, Integer> {
}
