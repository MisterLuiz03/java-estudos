package quiz;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
      int cont =0,valor = 0;
       
        
        
        do{
        String X = JOptionPane.showInputDialog(null, "Qual a emissora da TV brasileira exibia Super onze?\n1 - Rede Globo\n2 - SBT\n3 - Rede TV");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            
                        break;
                        case 2:
                            
                        break;
                        case 3:
                            cont++;
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        
        ;

        do{
        String X = JOptionPane.showInputDialog(null, "Quem é o lider dos Jovens Titãs?\n1 - Robin\n2 - Ciborgue\n3 - Mutano");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            cont++;
                        break;
                        case 2:
                            
                        break;
                        case 3:
                            
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        do{
        String X = JOptionPane.showInputDialog(null, "Quem é o irmão de Goku?\n1 - Vegeta\n2 - Raditz\n3 - Nappa");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            
                        break;
                        case 2:
                            cont++;
                        break;
                        case 3:
                            
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        do{
        String X = JOptionPane.showInputDialog(null, "Em que ano foi lançado Naruto?\n1 - 1997\n2 - 2000\n3 - 1999");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            
                        break;
                        case 2:
                            
                        break;
                        case 3:
                            cont++;
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        do{
        String X = JOptionPane.showInputDialog(null, "Qual o nome real do personagem Super Choque?\n1 - Virgil Hawkins\n2 - Robert Hawkins\n3 - Francis Stone");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            cont++;
                        break;
                        case 2:
                           
                        break;
                        case 3:
                            
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        do{
        String X = JOptionPane.showInputDialog(null, "Qual alien do Ben 10 Clássico tinha velocidade como poder principal?\n1 - Quatro Braços\n2 - XLR8\n3 - Insectóide");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            
                        break;
                        case 2:
                            cont++;
                        break;
                        case 3:
                            
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        do{
        String X = JOptionPane.showInputDialog(null, "Qual membro do X-men tinha como poder o teletransporte?\n1 - Wolverine\n2 - Jim Gray\n3 - Noturno");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            
                        break;
                        case 2:
                            
                        break;
                        case 3:
                            cont++;
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        do{
        String X = JOptionPane.showInputDialog(null, "Quem é a esposa de Homer Simpson?\n1 - Selma Bouvier\n2 - Maggie Simpson\n3 - Marge Simpson");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            
                        break;
                        case 2:
                            
                        break;
                        case 3:
                            cont++;
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        do{
        String X = JOptionPane.showInputDialog(null, "Qual membro da liga da justiça tem como fraqueza um cristal verde?\n1 - Flash\n2 - Superman\n3 - Mulher Gavião");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            
                        break;
                        case 2:
                            cont++;
                        break;
                        case 3:
                            
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        do{
        String X = JOptionPane.showInputDialog(null, "Quem é o melhor amigo de Mordecai?\n1 - Fantasmão\n2 - Rigby\n3 - Benson");
        valor = Integer.parseInt(X);  
        switch(valor){
                        case 1:
                            
                        break;
                        case 2:
                            cont++;
                        break;
                        case 3:
                            
                        break;
                        default:
                        
                        break;
                        }
        }while(valor <= 0 || valor >=4);
        
        if(cont >=1 && cont <=4){
            JOptionPane.showMessageDialog(null, "VOCÊ NÃO DOMINA O ASSUNTO");
        }else if(cont <=6){
            JOptionPane.showMessageDialog(null, "CONHECIMENTO BASICO SOBRE O ASSUNTO");
        }else if(cont <=9){
            JOptionPane.showMessageDialog(null, "QUASE UM MESTRE");
        }else if(cont <=10){
            JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ TEM PROFUNDOS CONHECIMENTOS SOBRE O ASSUNTO"); 
        }else{}







        JOptionPane.showMessageDialog(null, "você acertou "+cont);
        
        
    }
    
}
