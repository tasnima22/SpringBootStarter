package com.qa.starterproject.domain;

public class House {
	
	private Integer houseId;
	private String city;
	private Integer numberofbedrooms;
	private Boolean garden;
	
		
	public House() {
		super();
	}
	
	

	public House(Integer houseId, String city, Integer numberofbedrooms, Boolean garden) {
		super();
		this.houseId = houseId;
		this.city = city;
		this.numberofbedrooms = numberofbedrooms;
		this.garden = garden;
	}
	

	public Integer getHouseId() {
		return houseId;
	}


	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}



	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getNumberofbedrooms() {
		return numberofbedrooms;
	}

	public void setNumberofbedrooms(Integer numberofbedrooms) {
		this.numberofbedrooms = numberofbedrooms;
	}

	public Boolean getGarden() {
		return garden;
	}

	public void setGarden(Boolean garden) {
		this.garden = garden;
	}



	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", city=" + city + ", numberofbedrooms=" + numberofbedrooms + ", garden="
				+ garden + "]";
	}
	

}
