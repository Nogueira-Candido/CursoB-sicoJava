package cursoJava;

public class Fundamentos {

	public static void main(String[] args) {
		String nome = "Jose de Assis";
		int idade = 17;
		char sexo = 'M';
		double temperatura = 30.1;
		boolean arCondicionado = false;
		
		System.out.println("Exemplo 1 - Uso de variáveis na linguagem java");
		System.out.println("Exemplos: ");
		System.out.println("Nome: " + nome); 
		System.out.println("Idade: "+ idade);
		System.out.println("Sexo: "+ sexo);
		System.out.println("Temperatura: "+ temperatura);
		System.out.println("Ar Condicionado: "+ arCondicionado);
		System.out.println("_________________________________");
		System.out.println("");
		double i = 10;
		System.out.println("Exemplo 2 - Operadores Aritméticos e Atribuições");
		System.out.println("Exemplos: ");
		System.out.println("i = "+ i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5       | i = " + (i += 5));
		System.out.println("i -= 5       | i = " + (i -= 5));
		System.out.println("i *= 5       | i = " + (i *= 5));
		System.out.println("i /= 5       | i = " + (i /= 5));
		i++;
		System.out.println("i++         | i = "  +  i);
		i--;
		System.out.println("i--         | i = " +   i);
		
		System.out.println("_________________________________");
		System.out.println("");
		System.out.println("ESTRUTURA DE CONTROLE CONDICIONAL");
		System.out.println("");
		System.out.println("Exemplo Estrutura de controle condicional - if");
		System.out.println("");
		
		if(sexo == 'M') {
			System.out.println("Alistamento militar obrigatório");
		}
		
		
		System.out.println("");
		System.out.println("Exemplo 3 -  Estrutura de controle condicional - if - else");
		System.out.println("");
		
		if(idade < 18) {
			System.out.println("Menor de idade.");
		}else {
			System.out.println("Maior de idade");
		}
		
		System.out.println("");
		System.out.println("Exemplo 4 - Estrutura de controle condicional - if - else");
		System.out.println("");
		idade = 70;
		if(idade < 16) {
			System.out.println("PROIBIDO VOTAR");
			
		}else if(idade >=18 && idade <= 70 ){
			System.out.println("VOTO OBRIGATÓRIO");	
		}else {
			System.out.println("VOTO FACULTATIVO");
		}
		
		System.out.println("");
		System.out.println("Exemplo 5 - Estrutura de controle condicional - switch case");
		System.out.println("");
		System.out.println("1 - Cadastro de Usuário");
		System.out.println("2 - Cadastro de Clientes");
		System.out.println("3 - Relatórios");
		int op = 5;
		
		switch (op) {
		case 1:
			System.out.println("USUÁRIO");
			break;
		case 2:
			System.out.println("CLIENTES");
			break;
		case 3:
			System.out.println("RELATÓRIOS");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		}
		
		System.out.println("");
		System.out.println("Exemplo 6 - Estrutura de repetição - FOR");
		System.out.println("");
		
		for(int j = 10; j >0; j--) {
			System.out.println(j +" - hello");
		}
		
		System.out.println("");
		System.out.println("TABUADA - FOR");
		System.out.println("");
	
		int soma = 0;
		for(int a = 0; a < 11; a++) {
			//System.out.println(a);	
			
			for(int b = 0; b < 11; b++) {
				
				//System.out.println(b);
				
				System.out.println(a + " x " + b + " = " + (a * b));
				
			}
			
			System.out.println("");
		}	
		
		System.out.println("");
		System.out.println("Exemplo 7 - Estrutura de repetição - while");
		
		int contador = 0;
		while(contador <=10) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("");
		System.out.println("Exemplo 8 - Estrutura de repetição - do while");
		
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente? s/n?");
			
			novoJogo = 'n';
		}while(novoJogo == 's');
			System.out.println("GAME OWER!");
		}
	
	}
	
