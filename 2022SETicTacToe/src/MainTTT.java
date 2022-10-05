
public class MainTTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P b1[][] = {
	            { P.Empty, P.Empty, P.Empty, },
	            { P.Empty, P.Empty, P.Empty, },
	            { P.Empty, P.Empty, P.Empty, },
	        };
	        System.out.println( TTT.winner3x3(b1) );

	        P b2[][] = {
	                { P.X, P.O, P.X, },
	                { P.O, P.X, P.O, },
	                { P.X, P.X, P.O, },
	        };
	        System.out.println( TTT.winner3x3(b2) );
	        P b3[][] = {
	                { P.X, P.O, P.X, P.O, P.Empty },
	                { P.O, P.X, P.O, P.O, P.X },
	                { P.O, P.X, P.X, P.Empty, P.O},
	        };
	        System.out.println( TTT.winner3x5(b3) );
	        
	        P b4[][] = {
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		      
	        };
		    System.out.println( TTT.winner9x7(b4) );
		    P b5[][] = {
		    		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
	        		{ P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, P.Empty, },
		    };
		    System.out.println( TTT.tic_tac_crazy(b5, 4));
		        
		        
		        
		        
		  
	  
	}

}
