package com.example.francisco.androidejemplo

class Factory {
    companion object {
        var usuarios: ArrayList<Usuario> = ArrayList()
        init {
            usuarios.add(Usuario("Francisco", "Izurieta", "Azul"))
            usuarios.add(Usuario("Alexa", "Guerrero", "Negro"))
            usuarios.add(Usuario("David", "Rodriguez", "Verde"))
        }
    }
}