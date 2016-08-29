package beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

	
    private MessageService service;
	
	@Autowired
	private Song song;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }
    
    
    
    
    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
    
    public void printLyrics() {
    	System.out.println(this.song.singSong());
    }
    
    
}