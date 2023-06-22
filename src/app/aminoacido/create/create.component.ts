import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { Aminoacido } from '../aminoacido';
import { AminoacidosService } from '../aminoacido.service';
 
@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css'],
})
export class CreateComponent implements OnInit {
  aminoacidoForm: Aminoacido = {
    id: 0,
    name: '',
  };
  
 
  constructor(private aminoacidoService:AminoacidosService,
    private router:Router) {}
 
  ngOnInit(): void {}
 
  create(){
    this.aminoacidoService.create(this.aminoacidoForm)
    .subscribe({
      next:(data) => {
        this.router.navigate(["/aminoacido/home"])
      },
      error:(err) => {
        console.log(err);
      }
    })
  }
}
