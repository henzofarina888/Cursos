function getAdmin(map){
    let admins= [];
    for([key, val] of map){
        if(value == 'admin'){
            admins.push(key);
        }
    }
    return admins;
}

const usuario = new Map();

usuario.set("Luiz", "admin")
usuario.set("Henzo", "admin")
usuario.set("Jorge", "admin")
usuario.set("Pedro", "admin")

console.log(getAdmins(usuario));