package escritor;

import gerador.GeradorTexto;

public class EscritorTexto {
	
	public void escreveTexto(){
		GeradorTexto g1 = new GeradorTexto();
		System.out.println(g1.geraTexto());
	}
}
