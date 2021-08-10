import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Taza } from 'src/app/modelo/Taza';


@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  tazas: Taza[];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit() {
    this.service.getTazas()
      .subscribe(data => {
        this.tazas = data;
      })
  }

  Editar(taza: Taza): void {
    localStorage.setItem("id", taza.id.toString());
    this.router.navigate(["edit"]);
  }

  Pedido(taza: Taza): void {
    localStorage.setItem("id", taza.id.toString());
    this.router.navigate(["pedido"]);
  }



}
