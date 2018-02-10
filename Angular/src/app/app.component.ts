import {Component, Inject, OnInit} from '@angular/core';
import {SecertService} from './services/app.service.ts.service'
@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css'],
    providers: [SecertService]
})
export class AppComponent {

    constructor(private _service: SecertService) {}
    private userName: string;
    private secret: {name: string, secretName: string};
    getSecret() {
        this._service.getSecret(this.userName).subscribe(
            (data: {name: string, secretName: string}) => {
                this.secret = data;
            },
            error => {
                console.error(error);
            });
    }

}
