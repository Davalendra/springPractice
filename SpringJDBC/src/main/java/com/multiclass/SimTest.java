package com.multiclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimTest {


		@Autowired
		@Qualifier("airtel")		//Sim sim=new Airtel();	(Dynamic Disptach)
		Sim sim;
		
		public void test() {
			sim.call();
		}

}
