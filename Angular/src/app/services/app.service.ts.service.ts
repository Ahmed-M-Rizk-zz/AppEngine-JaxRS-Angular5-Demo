import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
@Injectable()
export class SecertService{

  constructor(private _httpCLient:HttpClient) {}
  public getSecret(secrectOwner:string){
      return this._httpCLient.get('/rest/secrets/'+secrectOwner);
  }

}
