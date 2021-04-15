public class Coordenada {
	private double x;
	private double y;
	//Constructor, initialize x, y attributes to zero
	public Coordenada( ){
		this(0,0);
	}
	//Constructor
	public Coordenada(double x, double y ){
		this.x = x;
		this.y = y;
	}
	//Constructor
	public Coordenada(Coordenada c ){
		this.x = c.x;
		this.y = c.y;
	}
	//métodos getter
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	
	//métodos setter
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y){
		this.y = y;	
	}
	//método de instancia que calcula la distancia euclideana
	double distancia(Coordenada c){
		double dist = Math.sqrt(Math.pow(c.x - this.x,2)+Math.pow(c.y - this.y,2));
		return dist;
	}
	//método de clase que calcula la distancia euclideana
	static double distancia(Coordenada c1, Coordenada c2){
		double dist = Math.sqrt(Math.pow(c2.x - c1.x,2)+Math.pow(c2.y - c1.y,2));
		return dist;
	}
	//método que devuelve los valores de una coordenada en determinado formato
	public String toString(){
		return "(" + x + "," + y + ")";
	}
}

