package io.javabrains;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TopicService {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("spring","Spring Framework","Spring Framework Description"),
				new Topic("java","Core Java","Core Java Description"),
				new Topic("javascript","JavaScript","JavaScript Description")
				));
	
	public List<Topic> getAllTopics() {
		//return topics;
		return restTemplate.getForObject("http://localhost:8082/topics", List.class);
	}
	
	public Topic getTopic(String Id) {
		return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String Id) {
		for (int i=0; i<topics.size();i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(Id)) {
				topics.set(i,topic);
				return;
			}
				
		}
		
	}

	public Topic deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return null;
	}
}
