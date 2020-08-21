package spring;

public class HelloBean2 implements Hello {

   private String name;
   
   public HelloBean2() {
      System.out.println("HelloBean1() 호출");
   }
   
   public HelloBean2(String name) {
      System.out.println("HelloBean1(String name) 호출");
      this.name = name;
   }
   
   public void sayHello() {   
      System.out.println( name + "하이");
   }
   
   
   public void sayHello(String name) {
      System.out.println( name + "하이");
   }

}