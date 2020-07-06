import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimalcontestComponent } from './animalcontest.component';

describe('AnimalcontestComponent', () => {
  let component: AnimalcontestComponent;
  let fixture: ComponentFixture<AnimalcontestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnimalcontestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnimalcontestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
