package expressãoposfixas;
import java.util.ArrayList;

public class Expressão {
 
    public static ArrayList<String> PosFixas(ArrayList entrada){
        Espressão arrumar = new Espressão(entrada);
        int contador =0;
        
        for(int i=0; arrumar.entrada.size()>i;i++){
            if (arrumar.entrada.get(i).charAt(0)=='*'||arrumar.entrada.get(i).charAt(0)=='/') {
                contador++;
            }
        }
        if (contador==0) { 
                int s=0;
                int f=arrumar.entrada.size()-1;
                arrumar.saida.add(arrumar.entrada.get(0));
                
            for(int i=1; f>i;i=i+2){           
                s=i+1;
                arrumar.saida.add(arrumar.entrada.get(s));
                arrumar.saida.add(arrumar.entrada.get(i));
                
            }
        }
        
        else if(contador!= 0){           
            arrumar.saida.add(arrumar.entrada.get(0));
           
            int f = arrumar.entrada.size()-1;
            int s=0;
            for(int i=1; f>i;i=i+2){
                s=i+1;
                if(contador==0){
                  arrumar.saida.add(arrumar.entrada.get(s));
                  arrumar.saida.add(arrumar.entrada.get(i));
                  
                }
                else{
                    if(arrumar.entrada.get(i).charAt(0)=='/'||arrumar.entrada.get(i).charAt(0)=='*'){
                        arrumar.saida.add(arrumar.entrada.get(s));
                        arrumar.saida.add(arrumar.entrada.get(i));
                        contador--;
                        if(contador==0){
                            for (int j = 0; j < arrumar.espera.size(); j++) {
                               arrumar.saida.add(arrumar.espera.get(j));
                            }
                        }
                    }
                    else{
                        arrumar.espera.add(arrumar.entrada.get(i));
                        arrumar.saida.add(arrumar.entrada.get(s));
                    }
                    
                }
             
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            }
        }
        
        return arrumar.saida;    
    }
}
