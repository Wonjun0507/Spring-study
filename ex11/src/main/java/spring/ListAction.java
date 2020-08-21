package spring;

public class ListAction implements BoardAction {
   
   private String writer;

   public String getWriter() {
      return writer;
   }

   public void setWriter(String writer) {
      this.writer = writer;
   }

   public ListAction() {
      // TODO Auto-generated constructor stub
      System.out.println("ListAction() 호출");
   }

   public void execute() {
      // TODO Auto-generated method stub
      System.out.println("writer : " + this.writer);

   }

   public void init_method() {
      System.out.println("초기화 메서드");
   }
   
   public void destroy_method() {
      System.out.println("제거 메서드");
   }

}