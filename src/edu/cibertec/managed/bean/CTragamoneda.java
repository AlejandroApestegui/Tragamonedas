package edu.cibertec.managed.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CTragamoneda {

	private Integer n1;
	private Integer n2;
	private Integer n3;

	private Boolean gano;
	private Integer creditos;

	public CTragamoneda() {
		iniciarJuego();
	}

	public String iniciarJuego() {
		this.creditos = 10;
		this.n1 = null;
		this.n2 = null;
		this.n3 = null;
		return "index";
	}

	public String jugar() {

		creditos--;

		if (creditos == -1) {
			return iniciarJuego();
		}

		this.n1 = generarNumero();
		this.n2 = generarNumero();
		this.n3 = generarNumero();

		if (n1 == n2 && n2 == n3) {
			this.gano = true;
			return "resultado";
		} else {
			this.gano = false;
			return null;
		}
	}

	public int generarNumero() {
		return (int) (Math.random() * 3) + 1;
	}

	public Integer getN1() {
		return n1;
	}

	public void setN1(Integer n1) {
		this.n1 = n1;
	}

	public Integer getN2() {
		return n2;
	}

	public void setN2(Integer n2) {
		this.n2 = n2;
	}

	public Integer getN3() {
		return n3;
	}

	public void setN3(Integer n3) {
		this.n3 = n3;
	}

	public Boolean getGano() {
		return gano;
	}

	public void setGano(Boolean gano) {
		this.gano = gano;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

}
