
public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("testando");
		int idade = 20;
		if(idade >= 18) {
			System.out.println("voce tem mais de 18 anos!");
		}else {
			System.out.println("voce eh nenem!");
		}
		
		System.out.println("testando condicionais");

        int quantidadePessoas = 3;        

        if (idade >=18 || quantidadePessoas >=2){
            System.out.println("Seja bem vindo"); 
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }
	}

}
