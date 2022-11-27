package com.example.sistemasmoviles.Controller

import com.example.sistemasmoviles.Model.Usuario

class UsuarioController(var model:Usuario) {
    fun getUserName():String{
        return model.Name
    }
    fun getUserid():String{
        return model.id
    }
    fun setUsarName(name:String){
        model.Name=name
    }
    fun updateView(){
        /*Se tendria que mandar la view desde los parametros como hicimos en el usuario para hacer esto
        * view.printDetails(model.Name,model.id)
        * siendo view la variable o el nombre que le dimos a esta*/

    }
}