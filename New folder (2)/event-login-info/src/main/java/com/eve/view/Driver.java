package com.eve.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.eve.dao.entryDao;
import com.eve.dao.guestDao;
import com.eve.dto.entry;
import com.eve.dto.guest;
import com.eve.service.MyConfig;


@Configuration
@ComponentScan(basePackages="com.eve")
public class Driver {

	
		public static void main(String[] args) {
			ApplicationContext app=new AnnotationConfigApplicationContext(MyConfig.class);
			Scanner scanner=(Scanner)app.getBean("getscanner");
			guest guest=(guest)app.getBean("guest");
			entry entry=(entry)app.getBean("entry");
			entryDao entryDao=(entryDao)app.getBean("entryDao");
			guestDao guestDao=(guestDao)app.getBean("guestDao");
			
			
			System.out.println("1.Register/n2.login/n3.exit");
			int option=scanner.nextInt();
			switch(option) {
			case 1:{
				System.out.println("enter name");
				String eve_name=scanner.next();
				System.out.println("enter cityname");
				String cityname=scanner.next();
				System.out.println("enter longitude");
				double longitude=scanner.nextDouble();
				System.out.println("enter latitude");
				double latitude=scanner.nextDouble();
				
			
			guest.setEve_name(eve_name);
			guest.setCityname(cityname);
			guest.setLogitude(longitude);
			guest.setLatitude(latitude);
			guest.setAttendances(guest);
			
			}
			break;
			case 2:{
				System.out.println("Enter name");
				String eve_name=scanner.next();
				System.out.println("Enter cityname");
				String cityname=scanner.next();
				
				guest employee1=guestDao.findEmpByPhnoAndPassword(eve_name,cityname);
				if(employee1!=null ) {
					entryDao.saveAttendance(entry);
					
					List<entry> attendances=new ArrayList<entry>();
					attendances.add(entry);
					
					employee1.saveAttendance(entry);
					guestDao.updateEmployee(employee1);
				}
			}

		}

	}
	

	}


