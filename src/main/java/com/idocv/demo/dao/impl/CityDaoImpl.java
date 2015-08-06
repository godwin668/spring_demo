package com.idocv.demo.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.idocv.demo.dao.CityDao;
import com.idocv.demo.po.City;

@Repository
public class CityDaoImpl extends BaseDaoImpl implements CityDao {

	@Override
	public City save(City city) {
		getHibernateTemplate().save(city);
		// getHibernateTemplate().flush();
		return city;
	}

	@Override
	public void delete(long id) {
		City city = get(id);
		getHibernateTemplate().delete(city);
		getHibernateTemplate().flush();
	}

	@Override
	public void update(City city) {
		getHibernateTemplate().update(city);
		getHibernateTemplate().flush();
	}

	@Override
	public City get(long id) {
		List<City> list = (List<City>) getHibernateTemplate().find("from " + City.class.getSimpleName() + " where id=?", id);
		if (null != list && !list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Override
	public City getByXinId(String xinId) {
		List<City> list = (List<City>) getHibernateTemplate().find("from " + City.class.getSimpleName() + " where xin_id=?", xinId);
		if (null != list && !list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Override
	public List<City> list(String query) {
		return (List<City>) getHibernateTemplate().find("from " + City.class.getSimpleName());
	}

}