package org.raj.kotw;


/**
 * @author Rene Andre B. Jocsing
 * ContinueGame singleton controls the state of the game loop—whether the user wants to play again or not. 
 */
class ContinueGame { //Singleton for ContinueGame Flag. 
	
    private static ContinueGame continueGameflag = null; 
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
    
    public void setFlag(String yesOrNo) {
 
    	switch(yesOrNo.toLowerCase()) {
    	case("yes"): this.contFlag = true; break;
    	case("no"): this.contFlag = false; break; 
    	}
    	
    }
    
    public boolean getFlag() {
    	return this.contFlag;
    }
    
    
}