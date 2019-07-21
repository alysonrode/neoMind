public class Relogio {

	public static void main(String[] args) {
//			Cria um objeto da classe EntradaDeDados
			EntradaDados dados = new EntradaDados();
//			Recebe o horário da sub classe GregorioCalendar, de acordo com o horário atual.
		
			int hora = dados.getHora();
			
			int minuto = dados.getMinutos();
			
//			Chama os metodos para conversão de hora em angulação.
			
			int anguloHora = Angulos.transformaHoraEmAngulo(hora);
			
			int anguloMinuto = Angulos.transformaMnutoEmAngulo(minuto);

//			Calcula o ângulo entre os ponteiros.
			
			int anguloEntrePonteiros = Angulos.calculaAnguloEntrePonteiros(anguloHora, anguloMinuto);
			
//			Faz a mostragem de todos os dados para o usuário.
			
			Graphics.mostraAnguloHoraAtual(anguloEntrePonteiros, hora, minuto);	
		
	}

}
