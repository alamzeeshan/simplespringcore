package beans;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	public String getMessage() {
        return "Hello World!";
      }

}
