let objects = {string: 'string', number: 1,boolean: true, 
array:["array"], objectInterno:{objectInterno:'objeto interno'}};
console.log(objects);

console.log(objects.string);



var string = objects.string;
console.log(string);

var arrayInterno = objects.array;
console.log(arrayInterno);

var {string,boolean} = objects;
console.log(string,boolean);