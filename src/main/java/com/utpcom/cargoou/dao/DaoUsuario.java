/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utpcom.cargoou.dao;

import com.utpcom.cargoou.entidades.Usuario;
import java.util.List;

/**
 *
 * @author user
 */
public interface DaoUsuario {
    List<Usuario> usuarioSel();
    Usuario usuarioGet(Integer id);
    Usuario usuarioLog(String cod, String cla);
    String usuarioIns(Usuario usuario);
    String usuarioUpd(Usuario usuario);
    String usuarioDel(Integer id);
    String getMensaje();
}
