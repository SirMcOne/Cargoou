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
    public List<UsuarioDto> usuarioSel();
    public UsuarioDto usuarioGet(Integer id);
    public UsuarioDto usuarioLog(String cod, String cla);
    public String usuarioIns(UsuarioDto usuario);
    public String usuarioUpd(UsuarioDto usuario);
    public String usuarioDel(List<Integer> ids);
    public String getMensaje();
}
