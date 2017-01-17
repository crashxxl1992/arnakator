package arnakator.model.impl;

import arnakator.model.IDescription;

public class Description implements IDescription{

	private String title;
	private String description;
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

}
