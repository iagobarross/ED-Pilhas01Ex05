package view;

import model.PilhaIntMax;

public class Principal {

	public static void main(String[] args) {
		PilhaIntMax p = new PilhaIntMax();
		
		p.push(5);
		p.push(80);
		p.push(3);
		p.push(849);
		p.push(-5);
		
		try {
			System.out.println(p.max());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
