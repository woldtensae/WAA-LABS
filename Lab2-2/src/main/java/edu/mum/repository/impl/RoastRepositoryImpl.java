package edu.mum.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import edu.mum.repository.RoastRepository;

@Repository
public class RoastRepositoryImpl implements RoastRepository{
	private static HashMap<String, List<String>> advice = new HashMap<String, List<String>>();
	
	static {
		ArrayList<String> darkList = new ArrayList<String>();
		darkList.add("Sumatra");
		darkList.add("Verona");
		darkList.add("French Roast");
		advice.put("dark", darkList);
		ArrayList<String> medList = new ArrayList<String>();
		medList.add("Breakfast Blend");
		medList.add("Colombia");
		medList.add("Yukon");
		medList.add("Pike Place");
		medList.add("House Blend");
		advice.put("medium", medList);
		ArrayList<String> lightList = new ArrayList<String>();
		lightList.add("Willow");
		lightList.add("Aria");
		lightList.add("Bright Sky");
		lightList.add("Veranda");
		advice.put("light", lightList);
	}
	public List<String> getAdvice(String roast) {
		return advice.get(roast);
	}
	
	public Set<String> getAdviceKeys(){
		return advice.keySet();
	}


}
