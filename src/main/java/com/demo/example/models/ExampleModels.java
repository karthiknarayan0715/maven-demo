package com.demo.example.models;

import java.util.ArrayList;
import java.util.List;

public class ExampleModels {
	private List<String> names = new ArrayList<String>();
	public ExampleModels () {
		names.add("Karthik");
		names.add("Narayan");
		names.add("New Name");
		names.add("Old Name");
		names.add("Very Creative Name");
	}
	public List<String> getNames() {
		return names;
	}
}
