package beans;

import org.springframework.stereotype.Component;

@Component
public class BlueSong implements Song {

	public String singSong() {
		return "I am Blue....la la la...";
	}

}
