package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controlador  implements ActionListener {
    JButton botones[][];
    Vista vista;
    Modelo modelo;
    
    boolean turno = true;
    
    
    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        
        botones = new JButton[3][3];
        botones[0][0] = vista.getJb_1();
        botones[0][1] = vista.getJb_2();
        botones[0][2] = vista.getJb_3();
        botones[1][0] = vista.getJb_4();
        botones[1][1] = vista.getJb_5();
        botones[1][2] = vista.getJb_6();
        botones[2][0] = vista.getJb_7();
        botones[2][1] = vista.getJb_8();
        botones[2][2] = vista.getJb_9();
        modelo.setBotones(botones);
        
        vista.getJb_1().addActionListener(this);
        vista.getJb_2().addActionListener(this);
        vista.getJb_3().addActionListener(this);
        vista.getJb_4().addActionListener(this);
        vista.getJb_5().addActionListener(this);
        vista.getJb_6().addActionListener(this);
        vista.getJb_7().addActionListener(this);
        vista.getJb_8().addActionListener(this);
        vista.getJb_9().addActionListener(this);
    
    }
    
    public void Iniciar_Vista(){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(e.getSource() == botones[i][j]){
                    if(turno == true){
                        botones[i][j].setText("X");
                        turno = false;
                    }
                    else{
                        botones[i][j].setText("O");
                        turno = true;
                    }
                }
            }
        }
        
        if(modelo.Validar() == true){
            vista.Gano(modelo.Ganador());
        }
    }
    
}
