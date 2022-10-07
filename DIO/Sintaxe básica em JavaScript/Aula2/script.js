// tipos primitivos.

//boolean
var vDul= false;
console.log(typeof(vDul));
console.log(vDul);

//number
var numeroqualquer=1;
console.log(typeof(numeroqualquer));
console.log(numeroqualquer);

//string
var nome = 'henzo';
console.log(typeof(nome));
console.log(nome);

// como declarar
var variable= `henzo`;
variable= 'giovanna';
console.log(variable);


let variable2= 'guilherme';
variable2= 'gabriel';
console.log(variable2);


const variable3= 'ana';
console.log(variable3);


// Posições.
var escopoGlobal = 'global';
console.log(escopoGlobal);

function escopoLocal(){
    let escopoLocalInterno = 'local';
    console.log(escopoLocalInterno);
}

escopoLocal();


//atribuição.

var atribuicao ="henzo";
console.log(atribuicao);

// comparação.

var comparacao = "0" == 10;
console.log(comparacao);

//comparação indenticos.
var comparacaoIdenticos= '0'=== '0';
console.log(comparacaoIdenticos);

//adição.
var adicao = 1+1;
console.log(adicao);

//subtração.
var subtracao = 5-1;
console.log(subtracao);

//multiplicação.
var multiplicacao = 2*9;
console.log(multiplicacao);

//divisão real 
var divisaoReal = 10/6;
console.log(divisaoReal)

//divisão inteira 
var divisaoInteira = 62%6;
console.log(divisaoInteira);

//potenciação
var potenciacao = 2**10;
console.log(potenciacao);

//maior que.
var maiorque = 10>5;
console.log(maiorque);

//menor que.
var menorque = 10<5;
console.log(menorque);

//maior que.
var maiorIgual = 10>=5;
console.log(maiorIgual);

//menor que.
var menorIgual = 10<=5;
console.log(menorIgual);

// e
var e = true && true; 
console.log(e);
//ou
 var ou = true || false
console.log(ou);

//não
var nao = !false;
console.log(nao);