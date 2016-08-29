package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.MessagePrinter;
import beans.MessageService;
import beans.Song;
import context.Application;

public class MainClass {

	 public static void main(String[] args) {
	      ApplicationContext context = 
	          new AnnotationConfigApplicationContext(Application.class);
	      
	      
	      
	      Song song = context.getBean(Song.class);
	      String lyrics = song.singSong();
	      System.out.println(lyrics);
	      
	      
	      MessageService message = context.getBean(MessageService.class);
	      String msg = message.getMessage();
	      System.out.println(msg);
	      
	      System.out.println("*************************************************");
	      
	      MessagePrinter printer = context.getBean(MessagePrinter.class);	      
	      printer.printMessage();
	      printer.printLyrics();
	  }

}
