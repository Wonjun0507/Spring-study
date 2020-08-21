package model1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ZipcodeDAO  {

   private DataSource dataSource = null;
   
   public ZipcodeDAO() {
      try{
         Context initCtx = new InitialContext();
         Context envCtx = (Context)initCtx.lookup("java:comp/env");
         this.dataSource = (DataSource)envCtx.lookup("jdbc/mariadb2");
      }catch (NamingException e) {
         System.out.println(e.getMessage());
      }
   }
   public ArrayList<ZipcodeTO> zipcodelist(ZipcodeTO pto){  // strdong이름을  zipcodeto에 반납.
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      Connection conn = null;
      
      ArrayList<ZipcodeTO> datas = new ArrayList<ZipcodeTO>();
      
      
      try {
         conn = dataSource.getConnection();
         
         String sql = "select zipcode, sido, gugun, dong, ri, bunji, seq from zipcode where dong like ?";
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1,pto.getDong()+"%");
         
         rs = pstmt.executeQuery();
         while(rs.next()) {   //next를 zipcodeto에 넣어야함
         ZipcodeTO to = new ZipcodeTO();
         to.setZipcode(rs.getString("zipcode"));
         to.setSido(rs.getString("sido"));
         to.setGugun(rs.getString("gugun"));
         to.setDong(rs.getString("dong"));
         to.setRi(rs.getString("ri"));
         to.setBunji(rs.getString("bunji"));
         to.setSeq(rs.getString("seq"));
         
         
         datas.add(to); //to 를 datas 에..
         }
         
      }catch(SQLException e) {
         System.out.println("에러 " + e.getMessage());
      }finally {
         if(pstmt != null) try{pstmt.close();} catch (SQLException e) {}
         if(rs != null) try{rs.close();} catch (SQLException e) {}
         if(conn != null) try{conn.close();} catch (SQLException e) {}
      }
      
      
      return datas;
   }
}

















