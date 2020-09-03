
var edad = 18;

if (edad >= 18) {
    console.log("Mayor de edad");
} else {
    console.log("Menor de edad");
}


//Comparando distintos tipos de variables int con String. 

var ceroNumber = 0;
var ceroString = "0";
//si pones == compara el valor, si pones === comapra el tipo
if (ceroNumber === ceroString) {
    console.log("Es igual");
} else {
    console.log("No es igual");
}