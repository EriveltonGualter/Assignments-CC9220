
public class Data {
	private int dia;
	private int mes;
	private int ano;

	Data( int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
	Data(){
		dia = 0;
		mes = 0;
		ano = 0;
	}
	
	public void setDia(int d){
		dia = d;
	}
	
	public void setMes(int m){
		mes = m;
	}
	
	public void setAno(int a){
		ano = a;
	}
	
	public String getData(){
		return (String.format("%d/%d/%d", dia,mes,ano));
	}
	
	public String getDias(){
		int dia_atual = 21;
		int mes_atual = 3;
		int ano_atual = 2016;
		
		int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int d1 = 0;
		if (ano_atual == ano && mes_atual == mes)
			d1 = dia_atual - dia;
		else
			d1 = daysPerMonth[mes] - dia;
		
		int d2 = 0;
		if (ano_atual > ano){
			for (int i=(mes+1); i<=12; i++){
				if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)) && i == 2 )
					d2 = d2 + 29;
				else
					d2 = d2 + daysPerMonth[i];
			}			
		}
		else {
			for (int i=(mes+1); i<=mes_atual; i++){
				if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)) && i == 2 )
					d2 = d2 + 29;
				else
					d2 = d2 + daysPerMonth[i];
			}	
		}
			

		int d3 = 0;
		for (int i=(ano+1); i<ano_atual; i++){
			if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
				d3 = d3 + 366;
			else
				d3 = d3 + 365;
		}
		int d4 = 0;
		int d5= 0;
		if (mes_atual != mes) {
			for (int i=1; i<mes_atual; i++){
				if ((ano_atual % 400 == 0) || ((ano_atual % 4 == 0) && (ano_atual % 100 != 0)) && i == 2 )
					d4 = d4 + 29;
				else
					d4 = d4 + daysPerMonth[i];
			}
			d5 = dia_atual;
		}
		else
			d5 = 0;
		
		int dias = d1+d2+d3+d4+d5;
			      
		return (String.format("%d", dias));
	}
}
