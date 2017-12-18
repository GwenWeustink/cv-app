import { Component, OnInit } from '@angular/core';
import { DocumentService } from '../../services/document/document.service';
import { Document } from '../models/document';

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.css']
})
export class DocumentComponent implements OnInit {

  docId: number;
  docName: String;
  docVersionNr: String;
  documents: Document[];

  constructor(private documentService: DocumentService) { }

  ngOnInit() {
    this.documentService.getDocuments().subscribe((documents) => {
      this.documents = documents;
    });
  }

  addDocument() {
    console.log('Add document');
  }
  showDocument() {
    console.log('Show document');
  }
  editDocument() {
    console.log('Edit document');
  }
  deleteDocument(document: Document) {
    if (window.confirm('Document \'' + document.docName + ' ' + document.docVersionNr + '\' wordt verwijderd. Weet u het zeker?')) {
      this.documentService.deleteDocument(document.docId);
    }
  }
}

