package com.idocv.demo.dao;

import java.util.List;

import com.idocv.demo.po.City;

public interface CityDao {

	public City save(City city);

	public void delete(long id);

	public void update(City city);

	public City get(long id);
	
	public City getByXinId(String xinId);

	public List<City> list(String query);

}