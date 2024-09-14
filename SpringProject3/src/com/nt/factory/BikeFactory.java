package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.Electric;
import com.nt.comps.Sports;
import com.nt.comps.Standard;

public class BikeFactory {
//factory pattern project
	public  static Bike orderBike(String type) {
		Bike bike=null;
		if(type.equalsIgnoreCase("Electric")) {
		     return bike=new Electric();
		}
		else if(type.equalsIgnoreCase("Sports")) {
			return bike=new Sports();
		}
		else if(type.equalsIgnoreCase("Standard")) {
			return bike=new Standard();
		}
		else
			throw new IllegalArgumentException("invalid bike type");
	}
}
