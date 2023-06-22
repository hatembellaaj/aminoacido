import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Aminoacido } from './aminoacido';

@Injectable({
  providedIn: 'root'
})
export class AminoacidosService {

  constructor(private http: HttpClient) {}
  get() {
    return this.http.get<Aminoacido[]>('http://localhost:3000/structure');
  }
  create(payload: Aminoacido) {
    return this.http.post<Aminoacido>('http://localhost:3000/structure', payload);
  }
  
}
