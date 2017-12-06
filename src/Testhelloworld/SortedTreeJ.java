package Testhelloworld;

import java.util.Stack;


public class SortedTreeJ {

	public Stack<Integer> sortedTreeJ(Stack<Integer> stack1)
	{

	        Stack<Integer> stack2 = new Stack<>();
	        int i = 0;
	        boolean rep;

	        do {
	            int max = stack1.pop();
	            rep = false;

	            while (!(stack1.empty())) {

	                if (stack1.peek() <= max) {
	                    rep = (stack1.peek() < max);
	                    stack2.push(stack1.pop());
	                } else {
	                    stack2.push(max);
	                    max = stack1.pop();
	                }
	            }
	            stack1.push(max);
                
	            while (!(stack2.empty())) {
	                stack1.push(stack2.pop());
	            }
	            if(rep)  { System.out.println("reloading stack for " + i++ + " time  "); }
	        } while (rep);
	        return stack1;
	 }
	  
	}


