import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnimalcontestComponent } from './animalcontest/animalcontest.component';
import { ContestParticipantsComponent } from './contest-participants/contest-participants.component';

@NgModule({
  declarations: [
    AppComponent,
    AnimalcontestComponent,
    ContestParticipantsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
