package com.test;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
   String hello = "HEllo World !!!";
   public void HelloWorld() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return hello;
   }

   public void listen(ValueChangeEvent  e){
       this.hello = e.getNewValue().toString();
       System.out.println(this.hello);
   }
}