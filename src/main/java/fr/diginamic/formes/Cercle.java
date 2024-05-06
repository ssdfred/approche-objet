package fr.diginamic.formes;



public  class Cercle extends Formes {
	protected double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
		
	}
	
	@Override
	public double calculSurface() {
		return Math.PI * Math.pow(rayon, 2);
	}

	@Override
	public double caculPerimetre() {
		return  2 * Math.PI * rayon;
	}
	

}
