package in.ashokit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	RestService rs=context.getBean(RestService.class);
	System.out.println(rs);
	rs.makepayment(1200);
}
}
