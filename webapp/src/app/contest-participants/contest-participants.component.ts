import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {Owner} from "./owner.model";
import {OwnerService} from "./owner.service";

@Component({
  selector: 'app-contest-participants',
  templateUrl: './contest-participants.component.html',
  styleUrls: ['./contest-participants.component.css']
})
export class ContestParticipantsComponent implements OnInit {
  owners : Array<Owner>;
  constructor( protected ownerService: OwnerService , protected router : Router) { }

  ngOnInit(): void {
    this.getOwners();
  }



  getOwners()
  {
      this.ownerService.getOwners().subscribe( result => this.owners = result );
  }



}
