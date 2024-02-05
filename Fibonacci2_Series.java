public class Fibonacci2_Series {
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
      for(int i=10; i<25; i++){
          System.out.println(""+fibonacci(i)+" ");
      }
      for(int i=2; i<8; i++){
	      System.out.println(""+fibonacci(i)+" ");
      }
      long after=System.currentTimeMillis();
      long result=after-before;
      System.out.println("Time Taken By Fibonacci Series:"+result+" MilliSeconds");
    }  
  }
  
