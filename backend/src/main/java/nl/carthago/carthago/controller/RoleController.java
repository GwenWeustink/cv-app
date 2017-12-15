package nl.carthago.carthago.controller;

import nl.carthago.carthago.domain.Role;
import nl.carthago.carthago.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    // Create
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Role create(@RequestBody Role role) {
        return roleService.create(role);
    }

    // Read (all)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Role> list() {
        return roleService.list();
    }

    // Read (one)
    @RequestMapping(value = "/{roleId}", method = RequestMethod.GET)
    public Role list(@PathVariable(value = "roleId") int roleId) {
        return roleService.list(roleId);
    }

    // Delete
    @RequestMapping(value = "/{roleId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "roleId") int roleId) {
        if (this.list(roleId) != null) {
            roleService.delete(roleId);
        }
    }
}
