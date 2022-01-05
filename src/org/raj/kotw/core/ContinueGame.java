package org.raj.kotw.core;


/**
 * @author Rene Andre B. Jocsing
 * ContinueGame singleton controls the state of the game loop, whether the user wants to play again or not. Core module.
 */
public class ContinueGame { //Singleton for ContinueGame Flag. 
	
	//Instance of the ContinueGame singleton.
    private static ContinueGame continueGameflag; 
   //The flag that stores the players decision.
    private boolean contFlag; 
    
    private ContinueGame()
    {
    	this.contFlag = true;
    }
 
    public static ContinueGame getInstance()
    {
        if (continueGameflag == null)
        	continueGameflag = new ContinueGame();
        
        return continueGameflag;
    }
    
    public void setFlag(String continueFlag) throws RuntimeException {
 
    	switch(continueFlag.toLowerCase()) {
    	case("yes"): this.contFlag = true; break;
    	case("no"): this.contFlag = false; break;
    	default: throw new RuntimeException ("Please answer correctly next time.");
    	}
    	
    }
    
    public boolean getFlag() {
    	return this.contFlag;
    }
    
    
}