// een monolite app, moet later gesplitst worden in user.module.ts, role.module.ts etc.
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule } from '@angular/http';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { DocumentComponent } from './components/document/document.component';
import { MenuComponent } from './components/menu/menu.component';
import { RoleComponent } from './components/role/role.component';
import { UserComponent } from './components/user/user-list/user.component';
import { UserService } from './services/user/user.service';
import { RoleService } from './services/role/role.service';
import { DocumentService } from './services/document/document.service';
import { UserDetailComponent } from './components/user/user-edit/user-detail.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import {FormsModule} from '@angular/forms';
// import { CommonModule} from './common/common.module'; // mock_users en Rest API

const appRoutes: Routes = [
  { path: '', component: DashboardComponent }, // hier lege component Dashboard met logo
  { path: 'user', component: UserComponent },
  { path: 'document', component: DocumentComponent },
  { path: 'role', component: RoleComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    DocumentComponent,
    MenuComponent,
    RoleComponent,
    UserComponent,
    UserDetailComponent,
    DashboardComponent
   // CommonModule
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [ UserService, RoleService, DocumentService ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
