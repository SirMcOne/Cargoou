/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class DeString {
    public static Integer aInteger(String s) {
        Integer result = null;
        if (s != null) {
            try {
                result = Integer.valueOf(s);
            } catch (NumberFormatException e) {
            }
        }
        return result;
    }
    public static Double aDouble(String s) {
        Double result = null;
        if (s != null) {
            try {
                result = Double.valueOf(s);
            } catch (NumberFormatException e) {
            }
        }
        return result;
    }
    public static List<Integer> ids(String _ids) {
        List<Integer> list = new ArrayList<>();
        if (_ids != null) {
            String[] v_ids = _ids.split(",");
            for (String v_id : v_ids) {
                Integer id = aInteger(v_id);
                if (id != null) {
                    list.add(id);
                } else {
                    list = null;
                    break;
                }
            }
        }
        return list;
    }
    /*Listas*/
    public static Integer[] aIntegerL(String[] s) {
        Integer[] result = null;
        if ((s != null) && (s.length > 0)) {
            result = new Integer[s.length];
            for (int i = 0; i < result.length; i++) {
                try {
                    result[i] = Integer.valueOf(s[i]);
                } catch (NumberFormatException ex) {
                    result = null;
                    break;
                }
            }
        }
        return result;
    }
    public static Double[] aDoubleL(String[] s) {
        Double[] result = null;
        if ((s != null) && (s.length > 0)) {
            result = new Double[s.length];
            for (int i = 0; i < result.length; i++) {
                try {
                    result[i] = Double.valueOf(s[i]);
                } catch (NumberFormatException ex) {
                    result = null;
                    break;
                }
            }
        }
        return result;
    }

}
