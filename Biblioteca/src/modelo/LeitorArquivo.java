/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Leo
 */
public class LeitorArquivo {
    
    ArrayList<Evento> eventos = new ArrayList<>();
    
    public ArrayList<Evento> importarArquivo(String nomeArquivo) throws IOException {
        File arquivo = new File(nomeArquivo);
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        //Pula a primeira linha do arquivo
        br.readLine();
        
        while (br.ready()) {
                String linha = br.readLine();
                String[] colunas = linha.split(",");
                Evento evento = new Evento(colunas[0], colunas[1], colunas[2], colunas[3],(int) Integer.parseInt(colunas[4]), colunas[5]);
                eventos.add(evento);

        }

        br.close();
        return eventos;
    }
    
}
