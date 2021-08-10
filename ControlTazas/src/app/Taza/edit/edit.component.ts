import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Taza } from 'src/app/modelo/Taza';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  taza: Taza = new Taza();
  constructor(private router: Router, private service: ServiceService) { }

  ngOnInit() {
    this.Editar();
  }

  Editar() {
    let id = localStorage.getItem("id");
    this.service.getTazaId(+id)
      .subscribe(data => {
        this.taza = data;
      })
  }

  Actualizar(taza: Taza) {
    this.service.updateTaza(taza)
      .subscribe(data => {
        this.taza = data;
        alert("La información se ha actualizado");
        this.router.navigate(["/listar"]);
      })
  }

}
