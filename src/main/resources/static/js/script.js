//const formularioCadastro = document.querySelector("form");
//const inome = document.querySelector(".nome");
//const iusuario = document.querySelector(".usuario");
//const isenha = document.querySelector(".senha");
//const iendereco = document.querySelector(".endereco");
//
//
//function cadastrar() {
//  fetch("http://localhost:8080/cadastro", {
//    headers: {
//      Accept: "application/json",
//      "Content-Type": "application/json",
//    },
//    method: "POST",
//    body: JSON.stringify({
//      nome: inome.value,
//     usuario: iusuario.value,
//      senha: isenha.value,
//      endereco: iendereco.value,
//    }),
//  })
//    .then(function (res) {
//      console.log(res);
//    })
//    .catch(function (res) {
//      console.log(res);
//    });
//};
//
//function limpar() {
//  inome.value = "";
//  iusuario.value = "";
//  isenha.value = "";
//  iendereco.value = "";
//
//};
//
//formularioCadastro.addEventListener("submit", function (event) {
//  event.preventDefault();
//
//  cadastrar();
//  limpar();
//  window.location.href = "http://localhost:8080/login";
//});

import { RegisterModule } from './request.js';

$(document).ready(function () {
  $('.formularioCadastro').on('submit', async function (e) {
    e.preventDefault();
    var credentials = {
      nome: $('#nome').val(),
      usuario: $('#usuario').val(),
      senha: $('#senha').val(),
      endereco: $('#endereco').val(),
    };

    try {
      const response = await RegisterModule.register(credentials);
      alert(response);
    } catch (error) {
      alert(error.responseText); // retornar responseText

    }
  });

});
