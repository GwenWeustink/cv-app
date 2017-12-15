package nl.carthago.carthago.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userdoc {
    private int userId;
    private String docId;
    private int userdocId;

    @Basic
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "docId", nullable = false, length = 45)
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    @Id
    @Column(name = "userdocId", nullable = false)
    public int getUserdocId() {
        return userdocId;
    }

    public void setUserdocId(int userdocId) {
        this.userdocId = userdocId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Userdoc userdoc = (Userdoc) o;

        if (userId != userdoc.userId) return false;
        if (userdocId != userdoc.userdocId) return false;
        if (docId != null ? !docId.equals(userdoc.docId) : userdoc.docId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (docId != null ? docId.hashCode() : 0);
        result = 31 * result + userdocId;
        return result;
    }
}
