import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Taza } from '../modelo/Taza';
import { Observable } from 'rxjs';
import { Pedido } from '../modelo/Pedido';



@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  Url = 'http://localhost:9090/tazas/consultarTazas';
  UrlAgregar = 'http://localhost:9090/tazas/agregarTazas';
  urlEditar = 'http://localhost:9090/tazas';
  urlModificar = 'http://localhost:9090/tazas/modificarTazas';
  urlPedido = 'http://localhost:9090/pedido/';

  getTazas() {
    return this.http.get<Taza[]>(this.Url);
  }

  createTaza(taza: Taza) {
    return this.http.post<Taza>(this.UrlAgregar, taza);
  }

  addTaza(taza: Taza): Observable<Taza> {
    return this.http.post<Taza>(this.UrlAgregar, taza);
  }

  getTazaId(id: number) {
    return this.http.get<Taza>(this.urlEditar + "/" + id);
  }

  updateTaza(taza: Taza) {
    //return this.http.put<Taza>(this.urlModificar + "/" + taza.id, taza);
    return this.http.put<Taza>(this.urlModificar, taza);
  }

  delete(id: number) {
    return this.http.delete<Taza>(this.Url + '/' + id);
  }

  addPedido(pedido: Pedido): Observable<Pedido> {
    return this.http.post<Pedido>(this.urlPedido, pedido);

  }
}
