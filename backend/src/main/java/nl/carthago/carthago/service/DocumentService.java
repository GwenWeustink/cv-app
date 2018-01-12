/*package nl.carthago.carthago.service;

import nl.carthago.carthago.domain.Document;
import nl.carthago.carthago.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    private DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Iterable<Document> list() {
        return documentRepository.findAll();
    }

    public Document list(int docId) {
        return documentRepository.findOne(docId);
    }

    
}
*/
package nl.carthago.carthago.service;

import nl.carthago.carthago.domain.Document;

public interface DocumentService {

    // Create
    Document create(Document document);

    // Read (all)
    Iterable<Document> list();

    // Read (one)
    Document list(int documentId);

    // Update
    Document update(int documentId, Document document);

    // Delete
    void delete(int documentId);
}
