import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AminoacidoRoutingModule } from './aminoacido-routing.module';
import { HomeComponent } from './home/home.component';
import { CreateComponent } from './create/create.component';


@NgModule({
  declarations: [
    HomeComponent,
    CreateComponent
  ],
  imports: [
    CommonModule,
    AminoacidoRoutingModule
  ]
})
export class AminoacidoModule { }
