$(document).ready(()=> {
      $('#modal-save-button').click(()=>{
          const nume = $('#modal-imc-nume').val();
          const inaltime = $('#modal-imc-inaltime').val();
          const greutate = $('#modal-imc-greutate').val();
          const body = {
              nume: nume,
              inaltime: inaltime,
              greutate: greutate,
              rezultat: rezultat
          };

       fetch('/api/imcs', {
           method: 'post',
           body: JSON.stringify(body),
           headers:{
               'Content-Type': 'application/json'
           }
       }).then(response => {
           location.reload();
       });
      });

      $('.fa-trash-alt').click(function () {
          const imcId = this.parentElement.id;
          fetch('api/imcs/'+imcId, {
              method:'delete'
          }).then( response => location.reload());
      })
})