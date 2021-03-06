package Modelo;

import javax.swing.JButton;

public class Modelo {
    JButton[][] botones;
    String ganador;
    
    public Modelo(){
        
    }
    
    public void setBotones (JButton[][] aux){
        botones = new JButton[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                botones[i][j] = aux[i][j]; 
            }
        }   
    }
    
    public boolean Validar(){
        int aux_o = 0;
        int aux_x = 0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(botones[i][j].getText() == "X"){
                    aux_x++;
                }
                else if(botones[i][j].getText() == "O"){
                    aux_o++;
                }
            }

            if(aux_x == 3){
                ganador = "X";
                return true;
            }
            else{
                aux_x = 0;
            }
            if(aux_o == 3){
                ganador = "O";
                return true;                
            }
            else{
                aux_o = 0;
            }
        }
        
        aux_x = 0;
        aux_o = 0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(botones[j][i].getText() == "X"){
                    aux_x++;
                }
                else if(botones[j][i].getText() == "O"){
                    aux_o++;
                }
            }

            if(aux_x == 3){
                ganador = "X";
                return true;
            }
            else{
                aux_x = 0;
            }
            
            if(aux_o == 3){
                ganador = "O";
                return true;                
            }
            else{
                aux_o = 0;
            }
        }
        
        aux_x = 0;
        aux_o = 0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i == j){
                    if(botones[i][j].getText() == "X"){
                        aux_x++;
                    }
                    else if(botones[j][i].getText() == "O"){
                        aux_o++;
                    }
                }
            }
        }
        
        if(aux_x == 3){
            ganador = "X";
            return true;
        }
        else{
            aux_x = 0;
        }
            
        if(aux_o == 3){
            ganador = "O";
            return true;                
        }
        else{
            aux_o = 0;
        }
        
        aux_x = 0;
        aux_o = 0;
        
        for(int i=0; i<3; i++){
            if(botones[i][2 - i].getText() == "X"){
                aux_x = 0;
            }
            else if(botones[i][2 - i].getText() == "O"){
                aux_o = 0;
            }            
        }
        
        if(aux_x == 3){
            ganador = "X";
            return true;
        }
        else{
            aux_x = 0;
        }
            
        if(aux_o == 3){
            ganador = "O";
            return true;                
        }
        else{
            aux_o = 0;
        }
        
        boolean empate = false;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(botones[i][j].getText() == "X" || botones[i][j].getText() == "O"){
                    empate = true;
                }
                else{
                    return false;
                }
            }
        }
       if(empate == true){
           ganador = "Empate";
           return true;
       }
        
        return false; 
        
    }
    
    public String Ganador(){
        return ganador;
    }
}