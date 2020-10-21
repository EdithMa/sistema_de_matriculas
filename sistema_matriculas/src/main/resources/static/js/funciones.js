

function validardni() {
  let input = document.getElementById('apoderadodni').value;
  if(input.length > 8) {
    alert("Solo se permiten 8 dígitos");
    return false;
  } 
}
/*
function validarLetras() {
	  const input = document.getElementById('nombreapoderado');
	  if(!input.checkValidity()) {
	    alert('El campo Nombre no es válido.');
	  } 
	}

function validarLetrasApelliA() {
	  const input = document.getElementById('apellidoapoderado');
	  if(!input.checkValidity()) {
	    alert('El campo Apellido no es válido.');
	  } 
	}

$('input[name=nombreApo').bind('keypress', function(event) {
	var regex = new RegExp("^[a-zA-Z ]+$");
	var key = String.fromCharCode(!event.charCode ? event.which : event.charCode);
	if (!regex.test(key)) {
	event.preventDefault();
	return false;
	}
	}); */

function soloLetras(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
    especiales = [8];

    tecla_especial = false
    for(var i in especiales) {
        if(key == especiales[i]) {
            tecla_especial = true;
            break;
        }
    }

    if(letras.indexOf(tecla) == -1 && !tecla_especial)
        return false;
}

function soloLetras1(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
    especiales = [8];

    tecla_especial = false
    for(var i in especiales) {
        if(key == especiales[i]) {
            tecla_especial = true;
            break;
        }
    }

    if(letras.indexOf(tecla) == -1 && !tecla_especial)
        return false;
}

function limpia() {
    var val = document.getElementById("ApoderadoNombre").value;
    var tam = val.length;
    for(i = 0; i < tam; i++) {
        if(!isNaN(val[i]))
            document.getElementById("ApoderadoNombre").value = '';
    }
}

function limpia1() {
    var val = document.getElementById("ApoderadoApellido").value;
    var tam = val.length;
    for(i = 0; i < tam; i++) {
        if(!isNaN(val[i]))
            document.getElementById("ApoderadoApellido").value = '';
    }
}
function limpia2() {
    var val = document.getElementById("AlumnoNombre").value;
    var tam = val.length;
    for(i = 0; i < tam; i++) {
        if(!isNaN(val[i]))
            document.getElementById("AlumnoNombre").value = '';
    }
}
function limpia3() {
    var val = document.getElementById("AlumnoApellido").value;
    var tam = val.length;
    for(i = 0; i < tam; i++) {
        if(!isNaN(val[i]))
            document.getElementById("AlumnoApellido").value = '';
    }
}

function soloNumeros(e)
{
	var key = window.Event ? e.which : e.keyCode
	return ((key >= 48 && key <= 57) || (key==8))
}


function soloLetras2(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
    especiales = [8];

    tecla_especial = false
    for(var i in especiales) {
        if(key == especiales[i]) {
            tecla_especial = true;
            break;
        }
    }

    if(letras.indexOf(tecla) == -1 && !tecla_especial)
        return false;
}

function limpia3() {
    var val = document.getElementById("ViveCon").value;
    var tam = val.length;
    for(i = 0; i < tam; i++) {
        if(!isNaN(val[i]))
            document.getElementById("ViveCon").value = '';
    }
}