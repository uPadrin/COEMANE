package com.mewtow.cardProcessor.model;

import com.opencsv.bean.CsvBindByPosition;

public class Test {

    @CsvBindByPosition(position = 0)
    private String IDdaTransação;

    @CsvBindByPosition(position = 1)
    private String DatadaTransação;

    @CsvBindByPosition(position = 2)
    private String Documento;

    @CsvBindByPosition(position = 3)
    private String Nome;

    @CsvBindByPosition(position = 4)
    private String Idade;

    @CsvBindByPosition(position = 5)
    private String Valor;

    @CsvBindByPosition(position = 6)
    private String NumdeParcelas;
}

