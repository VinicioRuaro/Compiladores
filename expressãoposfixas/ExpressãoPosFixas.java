package expressãoposfixas;

import javafx.print.PaperSource;

public class ExpressãoPosFixas {
    public static void main(String[] args) {

        System.out.println(SeparadorPalavras.SeparadaArrayList(LeitorArquivo.leitorArquivoString()));

        System.out.println(Expressão.PosFixas(SeparadorPalavras.SeparadaArrayList(LeitorArquivo.leitorArquivoString())));
       
        
        
    }
}
