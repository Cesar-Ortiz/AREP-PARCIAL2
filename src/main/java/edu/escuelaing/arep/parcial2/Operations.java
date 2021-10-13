package edu.escuelaing.arep.parcial2;

import java.util.HashMap;

public class Operations {
    public Operations() {
    }

    public HashMap<String, String> atan(String valu){
        double value = Double.valueOf(valu);
        HashMap<String, String> data = new HashMap<>();
        double result = Math.atan(value);
        String resultstr = String.valueOf(result);
        String valuestr = String.valueOf(value);
        data.put("operation", "atan");
        data.put("input", valuestr);
        data.put("output", resultstr);
        return data;
    }

    public HashMap<String, String> acos(String valu){
        double value = Double.valueOf(valu);
        HashMap<String, String> data = new HashMap<>();
        double result = Math.acos(value);
        String resultstr = String.valueOf(result);
        String valuestr = String.valueOf(value);
        data.put("operation", "acos");
        data.put("input", valuestr);
        data.put("output", resultstr);
        return data;
    }
}
