package nl.carthago.carthago.controller;

import nl.carthago.carthago.domain.User;
import nl.carthago.carthago.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    private UserController(UserService userService) {
        this.userService = userService;
    }

    // Create
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    // Read (all)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<User> list() {
        return userService.list();
    }

    // Read (one)
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User list(@PathVariable(value = "userId") int userId) {
        return userService.list(userId);
    }

    // Update
    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public User update(@PathVariable(value = "userId") int userId, @RequestBody User user) {
        return userService.update(userId, user);
    }

    // Delete
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "userId") int userId) {
        if (this.list(userId) != null) {
            userService.delete(userId);
            // status 200
        }
    }
}
