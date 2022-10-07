let array = ["jjj",'henzo',"te","teww","gg","ggg"];
console.log(array);


let array2 = ["henzo","te","teww",['array','henzo',"fafa"]];



array.forEach(function(item, index){(item, index)});


// adiciona no item no final
array.push ("novo item");

//tira ultimo item
array.pop();

//tira primeiro item
array.shift();

//novo item no inicio
array.unshift("novo item no inicio");


//procurar item e localização
console.log(array.indexOf("jjj"));

// apaga uma parte do array
array.splice(0,3);


//pega somente a parte do array e transforma em um novo.
let novoArray = array.slice(0,4);
console.log(novoArray);