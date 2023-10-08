package desafio.model;

public class Iphone14 implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando musica no Iphone14 ");		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica no Iphone14 ");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica no Iphone14 ");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página no Iphone14 ");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página no Iphone14 ");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no Iphone14 ");
	}

	@Override
	public void ligar() {
		System.out.println("Fazendo chamada o Iphone14 ");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada no Iphone14 ");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz página no Iphone14 ");
	}

}
