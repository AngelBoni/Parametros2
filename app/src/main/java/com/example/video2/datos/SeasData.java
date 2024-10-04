package com.example.video2.datos;

import com.example.video2.beans.Usuario;

import java.util.ArrayList;

public class SeasData {

    private static Usuario usuario;
    private static ArrayList<Usuario> ListaUsuario;

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        SeasData.usuario = usuario;
    }


}
