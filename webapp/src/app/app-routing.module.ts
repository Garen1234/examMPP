import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AnimalcontestComponent} from "./animalcontest/animalcontest.component";
import {ContestParticipantsComponent} from "./contest-participants/contest-participants.component";


const routes: Routes = [{path:"animalcontest",component:AnimalcontestComponent},
  {path:"animalcontest/contest-participants", component:ContestParticipantsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
