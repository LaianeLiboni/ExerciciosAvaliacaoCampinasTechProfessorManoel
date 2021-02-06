package Exercicio9;

public class ConversaoDeUnidadesDeTempo {
	
	public static double convertaMinutosParaSegundos(double minuto) {
		double segundos = minuto * 60;
		return segundos;
	}
	
	public static double convertaHoraParaMinutos(double hora) {
		double minutos = hora * 60;
		return minutos;
	}

	public static double convertaDiasParaHoras(double dias) {
		double horas = dias * 24;
		return horas;
	}
	
	public static double convertaSemanasParaDias(double semanas) {
		double dias = semanas * 7;
		return dias;
	}
	
	public static double convertaMesParaDias(double mes) {
		double dias = mes * 30;
		return dias;
	}
	
	public static double convertaAnoParaDias(double ano) {
		double dias = ano * 365;
		return dias;
	}
}