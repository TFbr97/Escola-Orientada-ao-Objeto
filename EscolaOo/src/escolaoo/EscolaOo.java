/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escolaoo;

import java.util.Scanner;

/**
 *
 * @author 62127512022.2
 */
public class EscolaOo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno aluno = new Aluno();
        
        Scanner scanner = new Scanner(System.in);
        
        aluno.inserirAluno();
        
        aluno.calcularMedia();
        
        aluno.verificarSituacao();
        
        aluno.mostrarAluno();
        
    }
    
}
