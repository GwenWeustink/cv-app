package nl.carthago.carthago.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctype {
    private int docTypeId;
    private String docTypeName;

    @Id
    @Column(name = "docTypeId", nullable = false)
    public int getDocTypeId() {
        return docTypeId;
    }

    public void setDocTypeId(int docTypeId) {
        this.docTypeId = docTypeId;
    }

    @Basic
    @Column(name = "docTypeName", nullable = true, length = 45)
    public String getDocTypeName() {
        return docTypeName;
    }

    public void setDocTypeName(String docTypeName) {
        this.docTypeName = docTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doctype doctype = (Doctype) o;

        if (docTypeId != doctype.docTypeId) return false;
        if (docTypeName != null ? !docTypeName.equals(doctype.docTypeName) : doctype.docTypeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = docTypeId;
        result = 31 * result + (docTypeName != null ? docTypeName.hashCode() : 0);
        return result;
    }
}
