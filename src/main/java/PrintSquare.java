
public class PrintSquare {
    
    public int ForLoop(int n){
        //for loop and if statements to design the square of "*"
          for(int i=0;i<n*5;i++){
            if(i<n|| i > (n*4)-1)
                for(int j=0;j<n*5;j++){
                    System.out.print("*");}
    
            else if(i>((n*2)-1) && i<(n*3))
                for(int j=0;j<n*5;j++){
                    if((j> (n-1) && j<(n*2)) || (j>((n*3)-1)&& j<(n*4)))
                    System.out.print(" ");
            else
                    System.out.print("*");}
    
            else
                    for(int j=0;j<n*5;j++){
                        if(j>(n-1)&& j < (n*4))
                    System.out.print(" ");
            else
                    System.out.print("*");}
                    System.out.println("");}
          return n;
    }
    
    public static void main(String[] args){
         // Call the ForLoop method to print the design on to the screen
        PrintSquare square = new PrintSquare();
        square.ForLoop(5);
        System.out.println();
        square.ForLoop(3);
          }
    
}

