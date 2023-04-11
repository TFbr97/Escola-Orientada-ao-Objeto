/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escolaoo;

import java.util.Scanner;

/**
 *
 * @author 62127512022.2
 */
public class Aluno {
    
    private String nomeAluno;
    private String cpfAluno;
    private double prova01;
    private double prova02;
    private double media;
    private String situacao;
    
    public Aluno() {
    
    
}
    
    public String getNome(){
        return nomeAluno;
    }
    
    public void setNome(String nomeAluno){
        this.nomeAluno = nomeAluno;
        
    }
    
    public String getCpf(){
        return cpfAluno;
    }
    
    public void setCpf(String cpfAluno){
        this.cpfAluno = cpfAluno;
    }
    
    public double getProva01(){
        return prova01;
    }
    
    public void setProva01(double prova01){
        this.prova01 = prova01;
    }

    public double getProva02() {
        return prova02;
    }

    public void setProva02(double prova02) {
        this.prova02 = prova02;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    void inserirAluno(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome completo do aluno: ");
        nomeAluno = scanner.nextLine();
        
        System.out.println("Digite o cpf do aluno: ");
        cpfAluno = scanner.nextLine();
        
        System.out.println("Digite a nota da primeira prova:");
        prova01 = scanner.nextInt();
        
        System.out.println("Digite a nota da segunda prova:");
        prova02 = scanner.nextInt();
        
    }
    
    void calcularMedia (){
        
        media = (getProva01() + getProva02())/2;
        System.out.println("Sua média é igual á " + media);
        
    }
    
    void verificarSituacao(){
        
        if (media >= 7) {
            
            situacao = "Você está aprovado!!";
            
            
        }
        
        else if (media < 7 || media >= 5){
            situacao = "Você está em recupevação. Não desista!!";
            
        }

        else {
            situacao = "Você está reprovado. Mais sorte na próxima.";
            
        }
        
        
        
    }
    
    void mostrarAluno(){
        
        System.out.println("Boletim do Semestre:\n" + nomeAluno + "\n" + cpfAluno + "\n" + "Prova 1: " + prova01 + "\n" + "Prova 2: " + prova02 + "\n" + "Sua média final é " + media + "\n" + "Sua situação é " + situacao);
        
    }

    
}
