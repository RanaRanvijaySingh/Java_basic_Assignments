package com.webonise.assignment.patternmatch;
import java.io.*;
import java.util.Stack;
/**
 * @author Ranvijay
 * this class accepts a string and check for the correct bracket format 
 *
 */
public class PatternMatch 
{
	 private String s;
   
    /**
     * @param s :string that contains the patter to be searched
     * @return true is the patter is correct 
     * return false is the pattern is not matched
     */
    boolean checkString(String s) 
    {
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) 
        {

            if(s.charAt(i) == '[')   
            	stack.push('[');
            
            else if (s.charAt(i) == '{')   
            	stack.push('{');

            else if (s.charAt(i) == '(') 
            	stack.push('(');

            else if (s.charAt(i) == ')') 
            {
                if (stack.isEmpty())        
                	return false;
            
                if (stack.pop() != '(') 
                	return false;
                
            }

            else if (s.charAt(i) == '}') 
            {
                if (stack.isEmpty())        
                	return false;
                
                if (stack.pop() != '{') 
                	return false;
            }

            else if (s.charAt(i) == ']') 
            {
                if (stack.isEmpty())        
                	return false;
                
                if (stack.pop() != '[') 
                	return false;
            }

        }
        return stack.isEmpty();
    }


    /**
     * main function
     */
    public static void main(String[] args) 
    {
        PatternMatch pattern=new PatternMatch();
        pattern.setString("[{(())}]");
    }


	/**
	 * @param string displays the message : is the patter is correct or not . 
	 */
	private void setString(String string) 
	{
		this.s=string;
		if(checkString(string))
		{
			System.out.print("pattern is correct");
			
		}
		else
		{
			System.out.print("pattern is incorrect");
		}
	}

}


