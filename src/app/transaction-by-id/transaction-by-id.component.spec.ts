import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransactionByIdComponent } from './transaction-by-id.component';

describe('TransactionByIdComponent', () => {
  let component: TransactionByIdComponent;
  let fixture: ComponentFixture<TransactionByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TransactionByIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TransactionByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
