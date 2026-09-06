public class Meteorologia {
	private double[] temperaturas;
	
	public void setTemperaturas(double[] temperaturas) {
        this.temperaturas = temperaturas;
    }
	public double[] getTemperaturas(){
		return temperaturas;
	}
	
	public Meteorologia(double[] temperaturas){
        this.temperaturas = temperaturas;
	}

    public double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma = soma + temperaturas[i]; 
        }
        return soma/temperaturas.length;
    }
}
