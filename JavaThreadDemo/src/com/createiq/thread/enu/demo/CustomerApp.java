package com.createiq.thread.enu.demo;

public class CustomerApp {

	public static void main(String[] args) {

		/// list of cakes

		System.out.println(" list of cakes.................");
		for (Cakes cake : Cakes.values()) {
			System.out.println(cake.getCakeNames());
		}

		System.out.println();

		Customer sachin = new Customer(20213012, "sachin", Cakes.BUTTERSCOTCH, "hyd");
		System.out.println(sachin.getCusId());
		System.out.println(sachin.getCusName());
		System.out.println(sachin.getCake().getCakeNames());
		System.out.println(sachin.getPrice());

	}

}
