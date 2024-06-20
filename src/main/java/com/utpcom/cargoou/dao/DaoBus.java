/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utpcom.cargoou.dao;

import com.utpcom.cargoou.dto.BusDto;
import java.util.List;

/**
 *
 * @author user
 */
public interface DaoBus {
    List<BusDto> busSel();
    BusDto busGet(Integer id);
    String busIns(BusDto bus);
    String busUpd(BusDto bus);
    String busDel(List<Integer> ids);
    String getMensaje();
}
