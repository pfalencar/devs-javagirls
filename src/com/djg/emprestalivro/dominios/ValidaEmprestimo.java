package com.djg.emprestalivro.dominios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidaEmprestimo {

    public Date convertStringToDate(String dataRecebida) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataFormatada = formato.parse(dataRecebida);
            return dataFormatada;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean compararDatas (Date emprestimo, Date devolucao) {
        if (emprestimo.before(devolucao)) {
            return true;
        }
        return false;
    }
}
