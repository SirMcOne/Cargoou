/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utpcom.cargoou.dao;

import com.utpcom.cargoou.dto.CorreoDto;
import java.util.List;

/**
 *
 * @author user
 */
public interface DaoCorreo {
    List<CorreoDto> correoSel();
    CorreoDto correoGet(Integer id);
    String correoIns(CorreoDto bus);
    String correoUpd(CorreoDto bus);
    String correoDel(List<Integer> ids);
    String getMensaje();
}
