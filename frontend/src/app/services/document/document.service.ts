import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { Http } from '@angular/http';

@Injectable()
export class DocumentService {

  constructor(public http: Http) { }

  getDocuments() {
    return this.http.get('http://localhost:3600/document/')
      .map(res => res.json());
  }
  addDocument() {}

  updateDocument() {}

  deleteDocument(docId: number): Observable<Response> {
    console.log('Deleting document ' + docId + '.');
    return this.http.delete('http://localhost:3600/document/${docId}')
      .map(res => res.json());
  }
}
