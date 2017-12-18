export class Document {
  docId:  number;
  docName: String;
  docVersionNr: String;

  constructor(docId: number, docName: String,  docVersionNr: String) {
    this.docId = docId;
    this.docName = docName;
    this.docVersionNr = docVersionNr;
  }
}
