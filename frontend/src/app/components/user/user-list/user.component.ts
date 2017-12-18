import { Component, OnInit } from '@angular/core';
import { UserService } from '../../../services/user/user.service';
import {RestApiService} from '../../../common/restapi.service';
import { error } from 'util';
import { User } from '../../models/user';
import {MOCK_USERS} from '../../../common/users/mock-users';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  userId: number;
  userCode: String;
  userName: String;
  users: User[];
  selectedUser: User;

  constructor(private userService: UserService) { }

  // constructor(private apiservice: RestApiService) { }
  // ngOnInit() {
  // this.users = this.apiservice.getListOfUsers();
  // }
  ngOnInit() {
    this.userService.getUsers()
      .subscribe(
       users => this.users = users,
       () => console.log('Error, wordt geen json gereturned'),
       () =>  console.log('finally')
    );
  }

  addUser() {
    // this.userService.addUser() ...
   // this.selectedUser = new User();
    console.log('Add user');
  }

  editUser(selectedUser: User) {
    this.selectedUser = selectedUser;
    // redirecten /routing naar user-detail.html
    console.log('Edit user');
  }
  deleteUser(user: User) {
    if (window.confirm('Gebruiker \'' + user.userName + '\' wordt verwijderd. Weet u het zeker?')) {
      this.userService.deleteUser(user.userId)
        .subscribe(
          () => {
            const index = this.users.indexOf(user, 0);
            if ( index > -1 ) {
              this.users.slice(index, 1);

            }

          },
          res => console.log('Error, wordt geen json gereturned'),
          () => console.log('finally')
        );
     }

  }
  showUser(selectedUser: User) {
    this.selectedUser = selectedUser;
    // redirecten /routing naar user-detail.html
    console.log('Show user');
  }
}

