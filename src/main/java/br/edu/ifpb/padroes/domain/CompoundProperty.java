package br.edu.ifpb.padroes.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundProperty {

	protected List<Property> children = new ArrayList<>();

	public List<Property> getChildren() {
		return children;
	}

	public void setChildren(List<Property> children) {
		this.children = children;
	}

	public void add(Property component) {
		children.add(component);
	}

	public void add(Property... components) {
		children.addAll(Arrays.asList(components));
	}

	public void remove(Property child) {
		children.remove(child);
	}

	public void remove(Property... components) {
		children.removeAll(Arrays.asList(components));
	}

	public void clear() {
		children.clear();
	}
}
