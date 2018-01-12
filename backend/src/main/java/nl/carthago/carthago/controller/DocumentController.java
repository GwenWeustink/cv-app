package nl.carthago.carthago.controller;

import nl.carthago.carthago.domain.Document;
import nl.carthago.carthago.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document")
public class DocumentController {

    private DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @RequestMapping("/")
    public Iterable<Document> list() {
        return documentService.list();
    }

    // Read (one)
    @RequestMapping(value = "/{docId}", method = RequestMethod.GET)
    public Document list(@PathVariable(value = "docId") int documentId) {
        return documentService.list(documentId);
    }

    // Update
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Document update(@PathVariable(value = "docId") int documentId, @RequestBody Document document) {
        return documentService.update(documentId, document);
    }

    // Delete
    @RequestMapping(value = "/{docId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "docId") int documentId) {
        if (this.list(documentId) != null) {
            documentService.delete(documentId);

        }
    }
    // hier search functie inbouwen

}


