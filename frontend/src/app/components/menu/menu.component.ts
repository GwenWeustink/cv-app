import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {
 constructor(private _router: Router) {}
   /** The current url */
   isActive(url: string): boolean {
     console.log('is url:' + url + '=' + this._router.url + '?');
     return url === this._router.url;
    }
 }
