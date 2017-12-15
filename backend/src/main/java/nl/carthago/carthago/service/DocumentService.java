package nl.carthago.carthago.service;

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
