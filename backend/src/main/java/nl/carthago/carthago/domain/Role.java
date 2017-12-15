package nl.carthago.carthago.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    private int roleId;
    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<User> userList;

    @Id
    @Column(name = "roleId", nullable = false)
    public int getRoleId() {

        return roleId;
    }

    public void setRoleId(int roleId) {

        this.roleId = roleId;
    }

    @Basic
    @Column(name = "roleName", nullable = true, length = 45)

    public String getRoleName() {

        return roleName;
    }

    public void setRoleName(String roleName) {

        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Role role = (Role) o;

        if (roleId != role.roleId)
            return false;
        if (roleName != null ? !roleName.equals(role.roleName) : role.roleName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }
}
