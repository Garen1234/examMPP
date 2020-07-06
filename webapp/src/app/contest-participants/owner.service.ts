import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {Owner} from "./owner.model";

const URL = 'http://localhost:8080/api/owners';

@Injectable()
export class OwnerService{

  constructor(private httpClient : HttpClient) {
  }

  getOwners(): Observable<Owner[]>
  {
    return this.httpClient.get<Owner[]>(URL);
  }

  getOwner(id:number):Observable<Owner>
  {
    console.log("hi");
    return this.httpClient.get<Owner>("http://localhost:8080/api/owner");
  }
}
