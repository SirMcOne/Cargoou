/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utpcom.cargoou.dao;

import com.utpcom.cargoou.dto.BusDto;
import com.utpcom.cargoou.entidades.Bus;
import java.util.List;

/**
 *
 * @author user
 */
public interface DaoBus {
    List<BusDto> busSel();
    BusDto busGet(Integer id);
    String busIns(Bus bus);
    String busUpd(Bus bus);
    String busDel(Integer id);
    String getMensaje();
}
