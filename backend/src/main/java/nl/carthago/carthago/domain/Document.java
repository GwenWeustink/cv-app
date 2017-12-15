package nl.carthago.carthago.domain;

import javax.persistence.*;

@Entity
public class Document {
    private int docId;
    private String docTypeId;
    private String docName;
    private String docVersionNr;

    @Id
    @Column(name = "docId", nullable = false)
    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    @Basic
    @Column(name = "docTypeId", nullable = true, length = 45)
    public String getDocTypeId() {
        return docTypeId;
    }

    public void setDocTypeId(String docTypeId) {
        this.docTypeId = docTypeId;
    }

    @Basic
    @Column(name = "docName", nullable = true, length = 45)
    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Basic
    @Column(name = "docVersionNr", nullable = true, length = 45)
    public String getDocVersionNr() {
        return docVersionNr;
    }

    public void setDocVersionNr(String docVersionNr) {
        this.docVersionNr = docVersionNr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (docId != document.docId) return false;
        if (docTypeId != null ? !docTypeId.equals(document.docTypeId) : document.docTypeId != null) return false;
        if (docName != null ? !docName.equals(document.docName) : document.docName != null) return false;
        if (docVersionNr != null ? !docVersionNr.equals(document.docVersionNr) : document.docVersionNr != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = docId;
        result = 31 * result + (docTypeId != null ? docTypeId.hashCode() : 0);
        result = 31 * result + (docName != null ? docName.hashCode() : 0);
        result = 31 * result + (docVersionNr != null ? docVersionNr.hashCode() : 0);
        return result;
    }
}
