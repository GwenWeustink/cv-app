package nl.carthago.carthago.controller;

import nl.carthago.carthago.domain.Document;
import nl.carthago.carthago.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/{docId}")
    public Document list(@PathVariable(value = "docId") int docId) {
        return documentService.list(docId);
    }
}
