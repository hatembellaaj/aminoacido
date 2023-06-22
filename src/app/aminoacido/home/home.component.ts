import { Component, OnInit } from '@angular/core';
import { Aminoacido } from '../aminoacido';
import { AminoacidosService } from '../aminoacido.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  allAminoacidos: Aminoacido[] = [];
 
  constructor(private aminoacidoService: AminoacidosService) {}
 
  ngOnInit(): void {
    this.get();
  }
 
  get() {
    this.aminoacidoService.get().subscribe((data) => {
      this.allAminoacidos = data;
    });
  }

}
