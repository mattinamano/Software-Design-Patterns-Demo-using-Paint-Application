package Commandpattern;

public class CommandExecutor {
	Command command;   
	  
    public void setCommand(Command comnd) 
    { 
        command = comnd; 
    } 
  
    public void executeCommand() 
    { 
    	command.execute(); 
    } 
}
