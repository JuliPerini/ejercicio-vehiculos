package ar.edu.utn.javaintermedio;

public class Vehiculo {
	
	 private String color;
	    private Integer cantidadDeRuedas;
	    private String marca;
	    
	    private Integer cantidadMarchas;
	    private Integer velocidadMaxima;
	    
	    
	   /* public Vehiculo(String color,String marca,Integer cantidadDeRuedas){
	        super();
	        this.color = color;
	        this.marca = marca;
	        this.cantidadDeRuedas= cantidadDeRuedas;
	    }*/
	    public String getColor() {
	        return color;
	    }
	    public void setColor(String color) {
	        this.color = color;
	    }
	    public Integer getCantidadDeRuedas() {
	        return cantidadDeRuedas;
	    }
	    public void setCantidadDeRuedas(Integer cantidadDeRuedas) {
	        this.cantidadDeRuedas = cantidadDeRuedas;
	    }
	    public String getMarca() {
	        return marca;
	    }
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    
	    
	    
	    public Integer getCantidadMarchas() {
	        return cantidadMarchas;
	    }
	    public void setCantidadMarchas(Integer cantidadMarchas) {
	        this.cantidadMarchas = cantidadMarchas;
	    }
	    public Integer getVelocidadMaxima() {
	        return velocidadMaxima;
	    }
	    public void setVelocidadMaxima(Integer velocidadMaxima) {
	        this.velocidadMaxima = velocidadMaxima;
	    }
	    
	    
	    public float velocidadPorMarcha()
	    {
	        float Resultado=this.velocidadMaxima/this.cantidadMarchas;
	        
	        return Resultado;
	            
	    }
	    public float velocidadPorRueda()
	    {
	        float Resultado2=this.velocidadMaxima/this.cantidadDeRuedas;
	        
	        return Resultado2;
	    }
	    
	    public int avanzar(int cantidadMinutos) {
	        int metrosAvanzados = 0;
	        
	        metrosAvanzados = this.getVelocidadMaxima() * cantidadMinutos / 60 * 1000;
	        return metrosAvanzados;
	        
	        
	        
	    }
	    


}
