package nl.carthago.carthago.service;

import nl.carthago.carthago.domain.User;

public interface UserService {

    // Create
    User create(User user);

    // Read (all)
    Iterable<User> list();

    // Read (one)
    User list(int userId);

    // Update
    User update(int userId, User user);

    // Delete
    void delete(int userId);
}
