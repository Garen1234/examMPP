import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {Owner} from "../contest-participants/owner.model";
import {OwnerService} from "../contest-participants/owner.service";

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {
  ownerId : number=0;
  owner: Owner;
  constructor(protected service: OwnerService,  private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.ownerId = params['owner-id'];


    });

    this.getOwn();
  }
    getOwn(): void
    {
       this.service.getOwner(this.ownerId).subscribe(result=> this.owner = result);
    }


}
