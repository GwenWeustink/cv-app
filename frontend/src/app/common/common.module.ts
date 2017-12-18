// shared modules here
import { NgModule } from '@angular/core';
import {RestApiService} from './restapi.service';

@NgModule({
  providers: [RestApiService]
})
export class CommonModule {}
