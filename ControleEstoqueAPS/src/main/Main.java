package main;

import DAO.UsuarioDAO;
import View.FrmInterface;


public class Main {
    public static void main(String[] args) {
//        FrmInterface telaLogin = new FrmInterface();
        
//        telaLogin.setVisible(true);

    UsuarioDAO user = new UsuarioDAO();
    
     
    
    System.out.println(user.pegarIdUsuario());
    }
}
