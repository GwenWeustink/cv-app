import {Component, Input, OnInit} from '@angular/core';
import { UserService } from '../../../services/user/user.service';
import { User } from '../../../common/users/User';
// import { User } from '../models/user';

@Component({
  selector: 'app-user-detail',
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.css']
})
export class UserDetailComponent implements OnInit {
//  @Input()
  selectedUser: User;

  constructor() {
    this.selectedUser = new User (4, 'test', 'test');
  }

  ngOnInit() {
  }

}
