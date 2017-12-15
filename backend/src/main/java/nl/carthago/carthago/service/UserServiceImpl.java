package nl.carthago.carthago.service;

import nl.carthago.carthago.domain.User;
import nl.carthago.carthago.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User list(int userId) {
        return userRepository.findOne(userId);
    }

    @Override
    @Transactional
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(int userId) {
        userRepository.delete(userId);
    }

    @Override
    public User update(int userId, User update) {
        User user = userRepository.findOne(userId);
        if (update.getUserCode() != null) {
            user.setUserCode(update.getUserCode());
        }
        if (update.getUserName() != null) {
            user.setUserName(update.getUserName());
        }
        if (update.getUserPassword() != null) {
            user.setUserPassword(update.getUserPassword());
        }
        return userRepository.save(user);
    }
}
