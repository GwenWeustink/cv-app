package nl.carthago.carthago.service;

import nl.carthago.carthago.domain.Role;

public interface RoleService {

    // Create
    Role create(Role role);

    // Read (all)
    Iterable<Role> list();

    // Read (one)
    Role list(int roleId);

    // Update
    Role update(int roleId, Role role);

    // Delete
    void delete(int roleId);
}
