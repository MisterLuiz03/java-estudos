package matriz00;


public class Principal_01_Matriz {

    
    public static void main(String[] args) {
        
    //Matriz quadrada: 3 linhas X 3 colunas
    int mtz[][] = {{1,2,3,4},{5,6}};
    
    int i, j;
        for (i = 0;  i< mtz.length; i++) {
            System.out.printf("%d° linha: " ,(i + 1));
                for (j = 0; j < mtz[i].length; j++) {
                    System.out.printf("%d", mtz[i][j]);
                }
            System.out.println("\n");
        }
    
    
        
    }
    
}
