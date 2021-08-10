import { Injectable } from '@angular/core';
import { FormControl } from '@angular/forms';

@Injectable({
    providedIn: 'root'
})
export class ValidadoresService {

    constructor() { }

    noAlta10(control: FormControl): { [s: string]: boolean } {
        if (control.value.toLowerCase() == 'alta') {
            return {
                noAlta10: true
            }
        }
        return null;

    }
}
