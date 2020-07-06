import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContestParticipantsComponent } from './contest-participants.component';

describe('ContestParticipantsComponent', () => {
  let component: ContestParticipantsComponent;
  let fixture: ComponentFixture<ContestParticipantsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContestParticipantsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContestParticipantsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
