package com.idocv.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.idocv.demo.po.City;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml", "classpath:servlet.xml" })
public class CityDaoTest {

	@Autowired
	private CityDao cityDao;

	@Test
	public void testSave() {
		List<City> cityList = new ArrayList<City>();
		cityList.add(new City("0", "全国", "全国", "quanguo"));
		cityList.add(new City("201", "北京", "北京", "beijing"));
		cityList.add(new City("2501", "四川", "成都", "chengdu"));
		cityList.add(new City("1708", "辽宁", "大连", "dalian"));
		cityList.add(new City("518", "广东", "佛山", "foshan"));
		cityList.add(new City("501", "广东", "广州", "guangzhou"));
		cityList.add(new City("1101", "黑龙江", "哈尔滨", "haerbin"));
		cityList.add(new City("3001", "浙江", "杭州", "hangzhou"));
		cityList.add(new City("101", "安徽", "合肥", "hefei"));
		cityList.add(new City("2101", "山东", "济南", "jinan"));
		cityList.add(new City("601", "广西", "南宁", "nanning"));
		cityList.add(new City("3002", "浙江", "宁波", "ningbo"));
		cityList.add(new City("2102", "山东", "青岛", "qingdao"));
		cityList.add(new City("2401", "上海", "上海", "shanghai"));
		cityList.add(new City("502", "广东", "深圳", "shenzhen"));
		cityList.add(new City("1701", "辽宁", "沈阳", "shenyang"));
		cityList.add(new City("901", "河北", "石家庄", "shijiazhuang"));
		cityList.add(new City("1502", "江苏", "苏州", "suzhou"));
		cityList.add(new City("2201", "山西", "太原", "taiyuan"));
		cityList.add(new City("2601", "天津", "天津", "tianjin"));
		cityList.add(new City("1201", "湖北", "武汉", "wuhan"));
		cityList.add(new City("2301", "陕西", "西安", "xian"));
		cityList.add(new City("1401", "吉林", "长春", "changchun"));
		cityList.add(new City("1301", "湖南", "长沙", "changsha"));
		cityList.add(new City("1001", "河南", "郑州", "zhengzhou"));
		cityList.add(new City("3101", "重庆", "重庆", "chongqing"));

		for (City city : cityList) {
			System.out.println("saving: " + city);
			cityDao.save(city);
		}

		System.out.println("Done!");
	}

}