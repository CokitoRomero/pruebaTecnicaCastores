import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Taza } from 'src/app/modelo/Taza';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { ValidadoresService } from 'src/app/Service/validadores.services';
import { myValidations } from 'src/app/utils/validacion';
import { Pedido } from 'src/app/modelo/Pedido';


@Component({
  selector: 'app-pedido',
  templateUrl: './pedido.component.html',
  styleUrls: ['./pedido.component.css']
})
export class PedidoComponent implements OnInit {

  taza: Taza = new Taza();
  forma: FormGroup;
  constructor(private router: Router, private service: ServiceService, private validador: ValidadoresService) {
  }

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

  GuardarPedido(pedido: Pedido) {
    //console.log(this.taza);
    this.service.addPedido(pedido)
      .subscribe(data => {
        if (pedido.cantidad == 10)
          alert("Se regalaran 3 tazas por su compra");
        else
          alert("Acción realizada correctamente");
        //this.router.navigate(["/listar"]);
      });
  }





}
