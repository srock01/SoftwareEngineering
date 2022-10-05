/**
 * If you are unfamiliar with tic-tac-toe, visit https://en.wikipedia.org/wiki/Tic-tac-toe
 * for a description of the game.
 *
 * Note: These comments are in javadoc/doxygen format.
 * Note: Java disables asserts by default.
 */
public class TTT {

    /**
     * Check for a 3-in-a-row winner on a 3x3 board.
     * @param board is the game board
     * @return true if there is a winner for either X or O; false otherwise
     */
    public static boolean winner3x3 ( P board[][] ) {
        //you can assume that you are given a 3x3 board
        assert board != null && board.length == 3 && board[0].length == 3;

        /** @todo add your code here */
        
        int xC= 0, oC= 0; 					//x and o counts
        for (int i = 0; i < board.length; i++) {  // checks rows for 3 in a row
        	for (int j = 0; j < board[0].length; j++) {
        		if ( board[i][j]== P.X)
        			xC++;
        		if ( board[i][j]== P.O)
        			oC++;
        	}
            if (xC ==3 || oC ==3)
            	return true;
            xC = 0;
            oC = 0;
            
        }
        for (int i = 0; i < board.length; i++) {  // checks columns for 3 in a row
        	for (int j = 0; j < board[0].length; j++) {
        		if ( board[j][i]== P.X)
        			xC++;
        		if ( board[j][i]== P.O)
        			oC++;
        	}
            if (xC ==3 || oC ==3)
            	return true;
            xC = 0;
            oC = 0;
            
        }
        int cross = board.length-1; // checks for diagonal three in a row 
        for (int i = 0; i < board.length; i++) {  // from the top right   
        	if ( board[cross][i]== P.X)			  // to bottom left
    			xC++;
    		if ( board[cross][i]== P.O)
    			oC++;
    		cross--;
        }
        if (xC ==3 || oC ==3)
        	return true;
        xC = 0;
        oC = 0;
        
        cross = 0;
        for (int i = 0; i < board.length; i++) {//checks for diagonal from top 
        	if ( board[i][cross]== P.X)			//left
    			xC++;
    		if ( board[i][cross]== P.O)
    			oC++;
    		cross++;
        }
        if (xC ==3 || oC ==3)
        	return true;
        return false;
    }

    /**
     * Check for a 3-in-a-row winner on a 3x5 board.
     * @param board is the game board
     * @return true if there is a winner for either X or O; false otherwise
     */
    public static boolean winner3x5 ( P board[][] ) {
        //you can assume that you are given a 3x5 board
        assert board != null && board.length == 3 && board[0].length == 5;

        /** @todo add your code here */
        int xC= 0, oC= 0;
        for (int i = 0; i < board.length; i++) { 	// checks rows for 3 in a row
        	for (int j = 0; j < board[0].length; j++) {
        		if ( board[i][j]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[i][j]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=3 || oC >=3) 
                	return true;
        		
        	}
            xC = 0;
            oC = 0;
            
        }
        for (int i = 0; i < board[0].length; i++) {//checks columns for 3 in a row
        	for (int j = 0; j < board.length; j++) {
        		if ( board[j][i]== P.X)
        			xC++;
        		if ( board[j][i]== P.O)
        			oC++;
        	}
            if (xC >=3 || oC >=3)
            	return true;
            
            xC = 0;
            oC = 0;
            
        }
        int col ;		// checks one side of diagonal for 3 in a row
        for (int i = 0; i < board[0].length-3; i++) {
        	col = board[0].length-1-i;
        	for(int j =0; j< board.length; j++) {
        		if ( board[j][col]== P.X)
        			xC++;
        		if ( board[j][col]== P.O)
        			oC++;
        		col--;
        	}
            if (xC >=3 || oC >=3)
            	return true;
            
            xC = 0;
            oC = 0;
        
        }
     // checks another side of diagonal for 3 in a row
        for (int i = 0; i < board[0].length-3; i++) {
        	col = i;
        	for(int j =0; j< board.length; j++) {
        		if ( board[j][col]== P.X)
        			xC++;
        		if ( board[j][col]== P.O)
        			oC++;
        		col++;
        	}
            if (xC >=3 || oC >=3)
            	return true;
            
            xC = 0;
            oC = 0;
        
        }
        
        
        return false;
    }

    /**
     * Check for a 3-in-a-row winner on a 9x7 board.
     * @param board is the game board
     * @return true if there is a winner for either X or O; false otherwise
     */
    public static boolean winner9x7 ( P board[][] ) {
        //you can assume that you are given a 9x7 board
        assert board != null && board.length == 9 && board[0].length == 7;

        /** @todo add your code here */
        int xC= 0, oC= 0;
        for (int i = 0; i < board.length; i++) { // checks rows for 3 in a row
        	for (int j = 0; j < board[0].length; j++) {
        		if ( board[i][j]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[i][j]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=3 || oC >=3) 
                	return true;
        		
        	}
            xC = 0;
            oC = 0;
            
        }
     // checks columns for 3 in a row
        for (int i = 0; i < board[0].length; i++) { 
        	for (int j = 0; j < board.length; j++) {
        		if ( board[j][i]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][i]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=3 || oC >=3) 
                	return true;
        		
        	}
            xC = 0;
            oC = 0;
            
        }
     // checks upper side of right to left diagonal for 3 in a row
        int col ;
        for (int i = 0; i < board[0].length-2; i++) {
        	col = board[0].length-1-i;
        	for(int j =0; j< board[0].length-i; j++) {
        		if ( board[j][col]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][col]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=3 || oC >=3) 
                	return true;
        		
        		col--;
        	}
            xC = 0;
            oC = 0;
        
        }
     // checks lower side of right to left diagonal for 3 in a row
        for (int i = 0; i < board.length-2; i++) {
        	col = board[0].length-1;
        	for(int j =i; j< board.length; j++) {
        		if (col ==-1)
        			continue;
        		if ( board[j][col]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][col]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=3 || oC >=3) 
                	return true;
        		
        		col--;
        	}
            xC = 0;
            oC = 0;
        
        }
     // checks upper side of left to right diagonal for 3 in a row
        for (int i = 0; i < board[0].length-2; i++) {
        	col = i;
        	for(int j =0; j< board[0].length-i; j++) {
        		if ( board[j][col]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][col]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		
        		if (xC >=3 || oC >=3) 
                	return true;
        		
        		col++;
        	}
            xC = 0;
            oC = 0;
        
        }
        
     // checks lower side of left to right diagonal for 3 in a row
        for (int i = 0; i < board.length-2; i++) {
        	col = 0;
        	for(int j =i; j< board.length; j++) {
        		if (col ==7)
        			continue;
        		if ( board[j][col]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][col]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		
        		if (xC >=3 || oC >=3) 
                	return true;
        		
        		col++;
        	}
            xC = 0;
            oC = 0;
        
        }
        return false;
    }

    /**
     * extra credit challenge: Check for a winner of arbitrary length on a
     * board of arbitrary size.
     * @param board is the game board
     * @param howMany is the (minimum) number in a row for a winner
     * @return true if there is a winner for either X or O; false otherwise
     */
    public static boolean tic_tac_crazy ( P board[][], int howMany ) {
        //you can assume that you are given a board of arbitrary size.
        // you may assume that it is not "ragged/jagged"
        // (see https://www.geeksforgeeks.org/jagged-array-in-java/).
        assert board != null;

        /** todo add your code here */
        
        int xC= 0; 
        int oC= 0;
        
        // checks rows for N in a row  
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board[0].length; j++) {
        		if ( board[i][j]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[i][j]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=howMany || oC >=howMany) {
                	return true;
        		}
        	}
            
            xC = 0;
            oC = 0;
            
        }
        
     // checks columns for N in a row  
        for (int i = 0; i < board[0].length; i++) {
        	for (int j = 0; j < board.length; j++) {
        		if ( board[j][i]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][i]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=howMany || oC >=howMany) {
                	return true;
        		}
        	}
            xC = 0;
            oC = 0;
            
        }
        
     // checks upper side of right to left diagonal for N in a row
        int col ;
        for (int i = 0; i <= board[0].length-howMany; i++) {
        	col = board[0].length-1-i;
        	for(int j =0; j< board.length-i; j++) {
        		if (col ==-1)
        			continue;
        		if ( board[j][col]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][col]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=howMany || oC >=howMany) 
                	return true;
        		
        		col--;
        	}
            xC = 0;
            oC = 0;
        
        }
        
     // checks lower side of right to left diagonal for N in a row
        for (int i = 0; i <= board.length-howMany; i++) {
        	col = board[0].length-1;
        	for(int j =i; j< board.length; j++) {
        		if (col ==-1)
        			continue;
        		if ( board[j][col]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][col]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=howMany || oC >=howMany) 
                	return true;
        		
        		col--;
        	}
            xC = 0;
            oC = 0;
        
        }
        
     // checks upper side of left to right diagonal for N in a row
        for (int i = 0; i <= board[0].length-howMany; i++) {
        	col = i;
        	for(int j =0; j< board.length; j++) {
        		if (col ==board[0].length)
        			continue;
        		if ( board[j][col]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][col]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		if (xC >=howMany || oC >=howMany) 
                	return true;
        		
        		col++;
        	}
            if (xC >=3 || oC >=3)
            	return true;
            
            xC = 0;
            oC = 0;
        
        }
        
     // checks lower side of left to right diagonal for N in a row
        for (int i = 0; i <= board.length-howMany; i++) {
        	col = 0;
        	for(int j =i; j< board.length; j++) {
        		if (col ==board[0].length)
        			continue;
        		if ( board[j][col]== P.X) {
        			xC++;
        			oC=0;
        		}
        		else if ( board[j][col]== P.O) {
        			oC++;
        			xC=0;
        		}
        		else {
        			oC=0;
        			xC=0;
        		}
        		
        		if (xC >=howMany || oC >=howMany) 
                	return true;
        		col++;
        	}
            
            
            xC = 0;
            oC = 0;
        
        }
        return false;
    }
    /**
     * Change this to true if you wish to try for extra credit.
     * If you don't, I won't check for extra credit.
     */
    public static final boolean checkExtraCredit = true;
}