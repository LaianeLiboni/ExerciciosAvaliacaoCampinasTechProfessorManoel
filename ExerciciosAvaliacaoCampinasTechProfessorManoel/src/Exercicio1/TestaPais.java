package Exercicio1;

import Pais.Pais;

public class TestaPais {
	
	public static void main(String[] args) {
		
		Pais brasil = new Pais("BRA", "Brasil", 8_516_000.0, 209_500_000.0);
		Pais argentina = new Pais("ARG", "Argentina", 2_780_000.0, 44_490_000.0);
		Pais chile = new Pais("CHI", "Chile", 756_950.0, 18_000_000.0);
		Pais guatemala = new Pais("GTM", "Guatemala", 108_889.0, 17_250_000.0);
		Pais uruguai = new Pais("URY", "Uruguai", 176_215.0, 3_449_000.0);
		Pais paraguai = new Pais("PRY", "Paraguai", 406_750.0, 6_956_000.0);
		Pais colombia = new Pais("COL", "Colombia", 1_141_748.0, 49_650_000.0);
		Pais equador = new Pais("ECU", "Equador", 256_370.0, 17_085_000.0);
		Pais bolivia = new Pais("BOL", "Bolivia", 1_098_581.0, 11_350_000.0);
		Pais venezuela = new Pais ("VEN", "Venezuela", 916_445.0, 28_870_000.0);
		
		System.out.println("Informa��es do " + brasil.getNome() );
		System.out.println("Codigo ISO: " + brasil.getCodigoISO());
		System.out.println("Dimens�o km2: " + brasil.getDimensaokm2());		

		System.out.println("Informa��es do " + argentina.getNome() );
		System.out.println("Codigo ISO: " + argentina.getCodigoISO());
		System.out.println("Dimens�o km2: " + argentina.getDimensaokm2());
				
		System.out.println("Informa��es do " + chile.getNome() );
		System.out.println("Codigo ISO: " + chile.getCodigoISO());
		System.out.println("Dimens�o km2: " + chile.getDimensaokm2());
				
		System.out.println("Informa��es do " + guatemala.getNome() );
		System.out.println("Codigo Iso: " + guatemala.getCodigoISO());
		System.out.println("Dimens�o km2: " + guatemala.getDimensaokm2());
				
		System.out.println("Informa��es do " + uruguai.getNome() );
		System.out.println("Codigo ISO: " + uruguai.getCodigoISO());
		System.out.println("Dimens�o km2: " + uruguai.getDimensaokm2());
		
		System.out.println("Informa��es do " + paraguai.getNome() );
		System.out.println("Codigo ISO: " + paraguai.getCodigoISO());
		System.out.println("Dimens�o km2: " + paraguai.getDimensaokm2());
		
		System.out.println("Informa��es do " + colombia.getNome() );
		System.out.println("Codigo ISO: " + colombia.getCodigoISO());
		System.out.println("Dimens�o km2: " + colombia.getDimensaokm2());
		
		System.out.println("Informa��es do " + equador.getNome() );
		System.out.println("Codigo ISO: " + equador.getCodigoISO());
		System.out.println("Dimens�o km2: " + equador.getDimensaokm2());
		
		System.out.println("Informa��es do " + bolivia.getNome() );
		System.out.println("Codigo ISO: " + bolivia.getCodigoISO());
		System.out.println("Dimens�o km2: " + bolivia.getDimensaokm2());
		
		System.out.println("Informa��es do " + venezuela.getNome() );
		System.out.println("Codigo ISO: " + venezuela.getCodigoISO());
		System.out.println("Dimens�o km2: " + venezuela.getDimensaokm2());
		
		
		System.out.println("Os paises s�o iguais? " + brasil.ComparaPais(argentina));		
		System.out.println("Os paises s�o iguais? " + venezuela.ComparaPais(colombia));
		
		System.out.println("Densidade populacional de "+ brasil.getNome() + " � " + brasil.CalculaDensidadePopulacional());		
		System.out.println("Densidade populacional de "+ guatemala.getNome() + " � " + guatemala.CalculaDensidadePopulacional());
		
		brasil.adicionaPaisLimitrofe(argentina);
		brasil.adicionaPaisLimitrofe(colombia);
		brasil.adicionaPaisLimitrofe(paraguai);
		brasil.adicionaPaisLimitrofe(venezuela);
		brasil.adicionaPaisLimitrofe(uruguai);
		brasil.adicionaPaisLimitrofe(bolivia);
		
		argentina.adicionaPaisLimitrofe(chile);
		argentina.adicionaPaisLimitrofe(brasil);
		argentina.adicionaPaisLimitrofe(paraguai);
		argentina.adicionaPaisLimitrofe(bolivia);
		argentina.adicionaPaisLimitrofe(uruguai);
		
				
		System.out.println(brasil.verificaSeOhPaisFazFronteira(argentina));
		System.out.println(brasil.verificaSeOhPaisFazFronteira(guatemala));
		System.out.println(brasil.verificaSeOhPaisFazFronteira(uruguai));
		System.out.println(brasil.verificaSeOhPaisFazFronteira(equador));
		System.out.println(brasil.verificaSeOhPaisFazFronteira(venezuela));
		System.out.println(brasil.verificaSeOhPaisFazFronteira(colombia));
		
		System.out.println(brasil.getPaisesLimitrofesEmComum(venezuela));
		System.out.println(brasil.getPaisesLimitrofesEmComum(argentina));
		


		
		
	}
	
}
		
		
		
