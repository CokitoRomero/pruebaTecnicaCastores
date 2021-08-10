import { AbstractControl } from '@angular/forms';

export class myValidations {
    static cantidadTaza(control: AbstractControl) {
        const value = control.value;
        if (value >= 10) {
            return { cantidadTaza: true }
        }
        return null;
    }
}