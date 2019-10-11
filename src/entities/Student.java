package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	public boolean aprovado;
	
	
	public void calculaNotaFinal() {
		this.notaFinal = this.nota1 + this.nota2 + this.nota3;
	}
	
	public boolean verificaAprovacao() {
		
		if(this.notaFinal > 60) {
			return true;
		} else {
			return false;
		}
	
	}
	
	public double pontosFaltantes() {
		return 60 - this.notaFinal;
	}
	
	public String statusStudent(boolean status) {
		if(status) {
			return "PASS";
		} else {
			return "FAIL";
		}
	}

}
