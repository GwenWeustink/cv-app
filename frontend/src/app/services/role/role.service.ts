import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Injectable()
export class RoleService {

  constructor(public http: Http) { }

  getRoles() {
    return this.http.get('http://localhost:3600/role/')
      .map(res => res.json());
  }
  addRole() {}

  updatRole() {}

  deleteRole(roleId: number): Observable<Response> {
    console.log('Deleting role ' + roleId + '.');
    return this.http.delete('http://localhost:3600/role/${roleId}')
      .map(res => res.json());
  }
}
