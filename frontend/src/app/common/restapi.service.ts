// zie https://www.youtube.com/watch?v=33ADKstmXqQ voor utleg en bouw
import {Injectable} from '@angular/core';
import { User } from './users/user';
import { Document } from './documents/document';
import { MOCK_USERS } from './users/mock-users';
import { MOCK_DOCUMENTS } from './documents/mock-documents';


@Injectable()
export class RestApiService {
  getListOfUsers(): User[] {
    return MOCK_USERS;
  }
  getListofDocuments(): Document[] {
    return MOCK_DOCUMENTS;
  }
}
