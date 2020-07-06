import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AnimalcontestComponent} from "./animalcontest/animalcontest.component";
import {ContestParticipantsComponent} from "./contest-participants/contest-participants.component";
import {DetailsComponent} from "./details/details.component";


const routes: Routes = [{path:"animalcontest",component:AnimalcontestComponent},
  {path:"animalcontest/contest-participants", component:ContestParticipantsComponent},
  {path:"animalcontest/contest-participants/details/:owner-id", component:DetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
