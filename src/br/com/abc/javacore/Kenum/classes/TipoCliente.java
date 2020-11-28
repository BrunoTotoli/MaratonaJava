package br.com.abc.javacore.Kenum.classes;

public enum TipoCliente {
	// constant specific class body
	// corpo de classe especifico constante
	// Sobrescrevendo o get id para pessoa juridica.
	PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica") {
		public String getId() {
			return "B";
		}
	};

	private int tipo;
	private String nome;
    /*O construtor vai se auto chamar, na enum*/
	TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	public String getId() {
		return "A";
	}

	public String getNome() {
		return nome;
	}

	public int getTipo() {
		return tipo;
	}
}
