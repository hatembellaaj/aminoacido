import { TestBed } from '@angular/core/testing';

import { AminoacidosService } from './aminoacido.service';

describe('AminoacidoService', () => {
  let service: AminoacidosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AminoacidosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});


