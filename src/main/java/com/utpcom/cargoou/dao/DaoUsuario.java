/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utpcom.cargoou.dao;

import com.utpcom.cargoou.dto.UsuarioDto;
import java.util.List;

/**
 *
 * @author user
 */
public interface DaoUsuario {
    List<UsuarioDto> usuarioSel();
    UsuarioDto usuarioGet(Integer id);
    UsuarioDto usuarioLog(String cod, String cla);
    String usuarioIns(UsuarioDto usuario);
    String usuarioUpd(UsuarioDto usuario);
    String usuarioDel(List<Integer> ids);
    String getMensaje();
}
