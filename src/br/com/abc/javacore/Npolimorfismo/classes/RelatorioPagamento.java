package br.com.abc.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

	public void relatorioPagamentoGenerico(Funcionario funcionario) {
		System.out.println("Gerando relatorio de Gerente");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("-------------------------");
		System.out.println("Salario do mes: " + funcionario.getSalario());

		if (funcionario instanceof Gerente) {
			Gerente g = (Gerente) funcionario;
			System.out.println("Participacao nos lucros " + g.getPnl());
		}
		if (funcionario instanceof Vendedor) {
			Vendedor v = (Vendedor) funcionario;
			System.out.println("Total Vendas" + v.getTotalVendas());
		}

	}
}
