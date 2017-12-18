export class User {
  userId:  number;
  userCode: String;
  userName: String;

  constructor(userId: number, userCode: String,  userName: String) {
    this.userId = userId;
    this.userCode = userCode;
    this.userName = userName;
  }
}
