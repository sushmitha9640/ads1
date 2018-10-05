public class Stack {
   private int maxSize;
   private static long[] stackArray;
   private static int top;
   
   public Stack(int s) {
      maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j) {
      stackArray[++top] = j;
   }
   public static long pop() {
      return stackArray[top--];
   }
   public long peek() {
      return stackArray[top];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == maxSize - 1);
   }
   public static void main(String[] args) {
      Stack S = new Stack(10); 
      S.push(10);
      S.push(20);
      S.push(30);
      S.push(40);
      S.push(50);
      Stack.pop();
      Stack.pop();
      while (!S.isEmpty()) {
        long value = Stack.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}