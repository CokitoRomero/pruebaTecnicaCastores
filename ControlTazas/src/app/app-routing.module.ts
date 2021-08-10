import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListarComponent } from './Taza/listar/listar.component';
import { AddComponent } from './Taza/add/add.component';
import { EditComponent } from './Taza/edit/edit.component';
import { PedidoComponent } from './Taza/pedido/pedido.component';

const routes: Routes = [
  { path: 'listar', component: ListarComponent },
  { path: 'add', component: AddComponent },
  { path: 'edit', component: EditComponent },
  { path: 'pedido', component: PedidoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
