/*package nl.carthago.carthago.service;

import nl.carthago.carthago.domain.Document;
import nl.carthago.carthago.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentServiceImpl {

    private DocumentRepository documentRepository;

    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository) {
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
import nl.carthago.carthago.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DocumentServiceImpl implements DocumentService {

    private DocumentRepository DocumentRepository;

    @Autowired
    public DocumentServiceImpl(DocumentRepository DocumentRepository) {
        this.DocumentRepository = DocumentRepository;
    }

    @Override
    public Iterable<Document> list() {
        return DocumentRepository.findAll();
    }

    @Override
    public Document list(int DocumentId) {
        return DocumentRepository.findOne(DocumentId);
    }

    @Override
    @Transactional
    public Document create(Document Document) {
        return DocumentRepository.save(Document);
    }

    @Override
    public void delete(int DocumentId) {
        DocumentRepository.delete(DocumentId);
    }

    @Override
    public Document update(int DocumentId, Document update) {
        Document Document = DocumentRepository.findOne(DocumentId);
        if (update.getDocTypeId() != null) {
            Document.setDocTypeId(update.getDocTypeId());
        }
        if (update.getDocName() != null) {
            Document.setDocName(update.getDocName());
        }
        if (update.getDocVersionNr() != null) {
            Document.setDocVersionNr(update.getDocVersionNr());
        }
        return DocumentRepository.save(Document);
    }
}

