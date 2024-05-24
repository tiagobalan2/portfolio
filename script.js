const formulario = document.querySelector("form");
const nome = document.querySelector("#nome");
const email = document.querySelector("#email");
const mensagem = document.querySelector("#mensagem");

function cadastrar() {
    fetch("http://localhost:8080/mensagem",
        {
            headers: {
                'Accept': 'application/json',
                'Content-type': 'application/json',
                'Access-Control-Allow-Origin': "*"
            },
            method: "POST",
            body: JSON.stringify({
                nome: nome.value,
                email: email.value,
                mensagem: mensagem.value
            })
        })
            .then (function (res) { return res.json() })
            .then (function (data) {console.log(data) })
            .catch (function (error) {console.error(error) })
        
}

function limpar() {
    nome.value = "";
    email.value = "";
    mensagem.value = "";
}

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
    limpar();
})
