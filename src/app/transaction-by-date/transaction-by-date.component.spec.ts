import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransactionByDateComponent } from './transaction-by-date.component';

describe('TransactionByDateComponent', () => {
  let component: TransactionByDateComponent;
  let fixture: ComponentFixture<TransactionByDateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TransactionByDateComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TransactionByDateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
