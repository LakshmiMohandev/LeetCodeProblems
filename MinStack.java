/*
 * 155. Min Stack
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */


public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minElement = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    public void push(int x) {
        stack.push(x);
        if(!minElement.empty()){
            if(minElement.peek() >= x)
                minElement.push(x);
            else if(minElement.peek() < x){
                minElement.push(minElement.peek());
            }
        }
        else 
            minElement.push(x);
    }
    
    public void pop() {
        if(!minElement.empty() && !stack.empty()){
                stack.pop();
                minElement.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(!minElement.empty())
            return minElement.peek();
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */