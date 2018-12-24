package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Spring Framework Description"),
				new Topic("A New Hope", "Episode 4", " It is a period of Civil war"),
				new Topic("Empire Strikes Back", "Episode 5", "It is a dark time for the Rebellion"),
				new Topic("Return of the Jedi","Episode 6","Luke Skywalker has returned to his home planet of Tatooine"));
	}

}
