import { Component, OnInit } from '@angular/core';
import { RoleService } from '../../services/role/role.service';

@Component({
  selector: 'app-role',
  templateUrl: './role.component.html',
  styleUrls: ['./role.component.css']
})
export class RoleComponent implements OnInit {

  roleId: number;
  roleName: String;
  roles: Role[];

  constructor(private roleService: RoleService) { }

  ngOnInit() {
    this.roleService.getRoles().subscribe((roles) => {
      this.roles = roles;
    });
  }

  addRole() {
    console.log('Add role');
  }
  editRole() {
    console.log('Edit role');
  }
  deleteRole(role: Role) {
    if (window.confirm('Rol \'' + role.roleName + '\' wordt verwijderd. Weet u het zeker?')) {
      this.roleService.deleteRole(role.roleId);
    }
  }
  showRole() {
    console.log('Show role');
  }
}

interface Role {
  roleId: number;
  roleName: String;
}
