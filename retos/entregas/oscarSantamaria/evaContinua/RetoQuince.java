public class EvaContinua {
 public static void main(String[] args){
       
        int profundidad = 21;
        
        
        for (int i=1; i<=21; i= i+1){
            for (int j=1; j<=21; j=j+1){
                if(i==2 & i==3 & i==4 & i==5){
                    System.out.print("  / ");
                }else{ 
                    System.out.print(" [] ");
                }
                
                if (j==2 & j==3 & j==4 & j==5){
                    System.out.print("  / ");
                }else{
                    System.out.print(" [] ");
                }

        } 
        System.out.println(" ");
        }
        
     }
    
}

   