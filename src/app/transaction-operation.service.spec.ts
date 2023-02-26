import { TestBed } from '@angular/core/testing';

import { TransactionOperationService } from './transaction-operation.service';

describe('TransactionOperationService', () => {
  let service: TransactionOperationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TransactionOperationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
