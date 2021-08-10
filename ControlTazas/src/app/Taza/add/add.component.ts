import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Taza } from 'src/app/modelo/Taza';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  taza: Taza = new Taza();

  constructor(private router: Router, private service: ServiceService) { }


  ngOnInit() {
  }

  Guardar(taza: Taza) {
    //console.log(this.taza);
    this.service.createTaza(taza)
      .subscribe(data => {
        alert("Acción realizada correctamente");
        this.router.navigate(["/listar"]);
      });
  }


  guardarNuevo(taza: Taza) {
    //const newTaza = {tipo='BAJA'}
    this.service.addTaza(taza)
      .subscribe(data => {
        alert("Acción realizada correctamente");
        this.router.navigate(["/listar"]);

      });
  }

}
