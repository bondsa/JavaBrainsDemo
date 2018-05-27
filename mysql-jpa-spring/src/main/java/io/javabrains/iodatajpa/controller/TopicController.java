package io.javabrains.iodatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.iodatajpa.dto.TopicsDTO;
import io.javabrains.iodatajpa.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	//get all topics
	@RequestMapping("/topics")
	public List<TopicsDTO> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	//get topic by id
	@RequestMapping("/topics/{id}")
	public TopicsDTO getTopicById(@PathVariable String id){
		return topicService.getTopicById(id);
	}
	//Add Topic by POST call
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody TopicsDTO topic){
		topicService.addTopic(topic);
	}
	//Update Topic by PUT call
	@RequestMapping(method=RequestMethod.PUT, value="/topics")
	public void updateTopic(@RequestBody TopicsDTO topic){
		topicService.updateTopic(topic);
	}
	//Delete Topic by id
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}
	
}
