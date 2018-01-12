import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html', // alle templets >> in html
  styleUrls: ['./app.component.css']

})
export class AppComponent {
  myType = '';
  title = 'Carthago CV App';
  imageUrl = './assets/Logo-24bright.png';
  // 'https://www.carthago-ict.nl/themes/carthago/images/24bright.png';
  imageUrl2 = './assets/Logo-Carthago.jpg';
   // 'https://www.carthago-ict.nl/themes/carthago/images/logoblack.png';

  // triggers
  onClickInfo(event: any) {
    console.log(event);
  }
  onMouseOverInfo(event: any) {
    console.log(event);
  }
  userInput(event: any) {
    this.myType = event.target.value();
  }
}
