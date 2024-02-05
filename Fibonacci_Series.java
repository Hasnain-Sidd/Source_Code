public class Fibonacci_Series {
    public static int fibonacci(int x){
      if(x==0){
          return 0;
      }
      else if(x==1){
          return 1;
      }
      else if(x==2){
          return 1;
      }
      else{
          return fibonacci(x-1)+fibonacci(x-2);
      }
    }
    public static void main (String[] args){
    
      System.out.println("Fibonacci Series:");
      long before=System.currentTimeMillis();
      for(int i=5; i<15; i++){
          System.out.println(""+fibonacci(i)+" ");
      }
      for(int i=20; i<30; i++){
        System.out.println(""+fibonacci(i)+" ");
    }
      long after=System.currentTimeMillis();
      long result=after-before;
      System.out.println("Time Taken By Fibonacci Series:"+result+" MilliSeconds");
    }  
  }
  