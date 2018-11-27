
/* Abrir modales del Home */

var prodImages = document.querySelectorAll('.prod-img');

prodImages.forEach(elem => {
      elem.addEventListener('click', (event) => {
      event.stopPropagation();

      if(elem.src === 'http://localhost:8080/images/Vaso.png'){
        var element = document.querySelector('#vasoModal');
      }
      else if(elem.src === 'http://localhost:8080/images/Cucurucho.png'){
        var element = document.querySelector('#cucuModal');
      }
      else if(elem.src === 'http://localhost:8080/images/Cuarto.png'){
        var element = document.querySelector('#cuartoModal');
      }
      else if(elem.src === 'http://localhost:8080/images/Medio.png'){
        var element = document.querySelector('#medioModal');
      }
      else if(elem.src === 'http://localhost:8080/images/Kilo.png'){
        var element = document.querySelector('#kiloModal');
      }
      var modal = M.Modal.init(element, {});
      modal.open();
    }, false);
});

/* Validar checkboxes clickeados */
var checkboxes = document.querySelectorAll('.single-checkbox');
var clickeados = new Array();
var checked = 0;

checkboxes.forEach(elem => {
    elem.addEventListener('change', (event) => {
        event.stopPropagation();
        if(elem.checked) {
           if(!clickeados.includes(elem)){
                   clickeados.push(elem);
           }
//           checked ++;
//           console.log(checked);
        }
        else{
            if(clickeados.includes(elem)){
                   clickeados.pop(elem);
            }
//            checked --;
//            console.log(checked);
        }
    });
});

/* Validar cuantos gustos fueron seleccionados antes de hacer el submit */
const formVasito = document.getElementById('vasitoForm');
    formVasito.addEventListener('submit',(event) => {
       const seleccionados = new FormData(formVasito);
       var formName = document.getElementById('formVasito').value;
      $('#vasitoForm').attr('action', seleccionados + '/' + formName + '/pedido');
});

const formCucu = document.getElementById('cucuForm');
formCucu.addEventListener('submit',(event) => {
   const seleccionados = new FormData(formCucu);
   var formName = document.getElementById('formCucu').value;
  $('#cucuForm').attr('action', seleccionados + '/' + formName + '/pedido');

});

const formCuarto = document.getElementById('cuartoForm');
formCuarto.addEventListener('submit',(event) => {
   const seleccionados = new FormData(formCuarto);
   var formName = document.getElementById('formCuarto').value;
  $('#cuartoForm').attr('action', seleccionados + '/' + formName + '/pedido');

});

const formMedio = document.getElementById('medioForm');
formMedio.addEventListener('submit',(event) => {
   const seleccionados = new FormData(formMedio);
   var formName = document.getElementById('formMedio').value;
  $('#medioForm').attr('action', seleccionados + '/' + formName + '/pedido');

});

const formKilo = document.getElementById('kiloForm');
formKilo.addEventListener('submit',(event) => {
   const seleccionados = new FormData(formKilo);
   var formName = document.getElementById('formKilo').value;
    $('#kiloForm').attr('action', seleccionados + '/' + formName + '/pedido');
});

//const pedidoForm = $('#formPedidoo');
//pedidoForm.addEventListener('submit', () => {
//    $('#formPedidoo').attr('action', seleccionados + '/mail');
//});

//var btnaceptar = $('#btnAceptar');
//btnaceptar.addEventListener('click', (e) => {
//    e.preventDefault();
//    console.log('clickeado');
//});