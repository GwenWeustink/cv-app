import { Injectable } from '@angular/core';
import { Http, Headers, Response } from '@angular/http';
import { Observable } from 'rxJS/Observable';
import 'rxjS/add/operator/map'; // map
import 'rxjS/add/operator/catch';
import 'rxjS/add/Observable/throw';
// import { User } from './models/user';

@Injectable()
export class UserService {
  private userUrl = `http://localhost:3600/user/`;
  private headers = new Headers({'Content-Type': 'application/json'});

  constructor(public http: Http) { }

  getUsers(): Observable<any> {
    return this.http.get(this.userUrl)
     // .catch(this.handleError)
      .map(res => res.json()); // as User[]

  }

  deleteUser(userId: number): Observable<any> {
    const deleteUrl = `http://localhost:3600/user/${userId}`;
    console.log('Deleting user ' + userId + '.');
    return this.http.delete(deleteUrl)
      // .catch(this.handleError)
       .map(res => res.json()); // as User[];
  }

  addUser() {}

  updateUser() {}

  private handleError(response: Response): Observable<any> {
    console.log('An error occured:', response);
    const errorMessage = `${response.status} - ${response.statusText}`;
    return Observable.throw(errorMessage);
  }
}

// apart component
