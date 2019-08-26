package com.rado.core;

import java.util.List;
import java.util.Random;

import com.rado.contracts.AdvertisementMessageGenerator;

public class AdvertisementMessageGeneratorImpl implements AdvertisementMessageGenerator {

	private final List<String> _phrases;
	private final List<String> _events;
	private final List<String> _authors;
	private final List<String> _cities;

	public AdvertisementMessageGeneratorImpl(
			List<String> phrases, 
			List<String> events, 
			List<String> authors, 
			List<String> cities) {
				_phrases = phrases;
				_events = events;
				_authors = authors;
				_cities = cities;
	}
	
	@Override
	public String generateMessage() {
		Random rand = new Random();
		
		String phrase = _phrases.get(rand.nextInt(_phrases.size()));
		String event = _events.get(rand.nextInt(_events.size()));
		String author = _authors.get(rand.nextInt(_authors.size()));
		String city = _cities.get(rand.nextInt(_cities.size()));
		
		return String.format("%s %s %s - %s", phrase, event, author, city);
	}

}
