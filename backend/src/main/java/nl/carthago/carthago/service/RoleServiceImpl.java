package nl.carthago.carthago.service;

import nl.carthago.carthago.domain.Role;
import nl.carthago.carthago.domain.User;
import nl.carthago.carthago.repository.RoleRepository;
import nl.carthago.carthago.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Iterable<Role> list() {
        return roleRepository.findAll();
    }

    @Override
    public Role list(int roleId) {
        return roleRepository.findOne(roleId);
    }

    @Override
    @Transactional
    public Role create(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void delete(int roleId) {
        roleRepository.delete(roleId);
    }

    @Override
    public Role update(int roleId, Role update) {
        Role role = roleRepository.findOne(roleId);
        if (update.getRoleName() != null) {
            role.setRoleName(update.getRoleName());
        }
        return roleRepository.save(role);
    }
}
