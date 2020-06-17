package io.javabrains;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{Id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public Topic getTopic(@PathVariable String Id) {
		return topicService.getTopic(Id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	@CrossOrigin(origins = "http://localhost:3000")
	public Topic addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		return topicService.getTopic(topic.getId());
		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{Id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String Id) {
		topicService.updateTopic(topic, Id );
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{Id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public void deleteTopic(@PathVariable String Id) {
		topicService.deleteTopic(Id);
	}
}
