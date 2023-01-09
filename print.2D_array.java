public class solution {
	public static void print2DArray(int input[][]) {
	int c=0,n=input.length;
        for(int i=0;i<input.length;i++){
            c=0;
            while(c<n-i){
            for(int j=0;j<input[i].length;j++){
                System.out.print(input[i][j]+" ");
              
            } 
            c++;
            System.out.println();
            }
        }
    }
}
