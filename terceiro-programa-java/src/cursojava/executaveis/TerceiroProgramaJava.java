package cursojava.executaveis;

import cursojava.classes.Aluno;

public class TerceiroProgramaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.setNome("Leandro Marques");
		aluno1.setIdade(41);
		aluno1.setDataNascimento("18/07/1982");
		aluno1.setRegistroGeral("7 748.849-9");
		aluno1.setNumeroCpf("039.791.379-61");
		aluno1.setNomeMae("Marlene Marques");
		aluno1.setNomePai("Antonio Marques");
		aluno1.setDataMatricula("10/10/20221");
		aluno1.setSerieMatriculado("5 Seria");
		aluno1.setNomeEscola("Escola Joao XXIII");
		aluno1.setNota1(90);
		aluno1.setNota2(90);
		aluno1.setNota3(90);
		aluno1.setNota4(90);
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Data de Nascimento  é = " + aluno1.getDataNascimento());
		System.out.println("RG é = " + aluno1.getRegistroGeral());
		System.out.println("CPF é = " + aluno1.getNumeroCpf());
		System.out.println("Mãe é = " + aluno1.getNomeMae());
		System.out.println("Pai é = " + aluno1.getNomePai());
		System.out.println("Matricula é = " + aluno1.getDataMatricula());
		System.out.println("Serie é = " + aluno1.getSerieMatriculado());
		System.out.println("Escola é = " + aluno1.getNomeEscola());

		System.out.println("******************************************");
		
		System.out.println("Minha média é = " + aluno1.getMediaNOta());
		System.out.println("Aluno esta  = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Aluno esta  = " + aluno1.getAlunoAprovado2());
		
		System.out.println("******************************************");

		aluno2.setNome("Leandro Marques aluno2");
		aluno2.setIdade(41);
		aluno2.setDataNascimento("18/07/1982");
		aluno2.setRegistroGeral("7 748.849-9");
		aluno2.setNumeroCpf("039.791.379-61");
		aluno2.setNomeMae("Marlene Marques aluno2");
		aluno2.setNomePai("Antonio Marques aluno2");
		aluno2.setDataMatricula("10/10/20221");
		aluno2.setSerieMatriculado("5 Seria aluno2");
		aluno2.setNomeEscola("Escola Joao XXIII aluno2");
		
		System.out.println("Nome é = " + aluno2.getNome());
		System.out.println("Idade é = " + aluno2.getIdade());
		System.out.println("Data de Nascimento  é = " + aluno2.getDataNascimento());
		System.out.println("RG é = " + aluno2.getRegistroGeral());
		System.out.println("CPF é = " + aluno2.getNumeroCpf());
		System.out.println("Mãe é = " + aluno2.getNomeMae());
		System.out.println("Pai é = " + aluno2.getNomePai());
		System.out.println("Matricula é = " + aluno2.getDataMatricula());
		System.out.println("Serie é = " + aluno2.getSerieMatriculado());
		System.out.println("Escola é = " + aluno2.getNomeEscola());

	}

}
